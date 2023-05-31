/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logMonitority;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Samsung
 */
public class GerarLogMonitority {
    private static final Integer tamanhoMaximoArquivo = 1024 * 1024; // Tamanho máximo do arquivo de log em bytes 1.025 KB
    private static String nomeArquivo = "C:/Users/Samsung/Desktop/PI/3ºsemestre (ADS)/logMonitority/arquivoLog";
    private static final String datatime = "yyyy-MM-dd HH:mm:ss";

    //nivel contextual de nivel que futuramente só iremos ultilizar um
    private static final Integer nivelBasico = 1;
    private static final Integer nivelMedio = 2;
    private static final Integer nivelErro = 3;

    private static Integer nivelLog = nivelErro;//<---- aaqui eu preciso mudar para nível erro ou não preciso chamar nada.
    private static BufferedWriter writer; //inserir uma nova linha após cada mensagem de log.
    private static long tamanhoAtualLog;
    
        //Métodos para registrar mensagens de log:
    //mensagem de erro no log
    public static void logErro(String messagem) throws IOException {

        if (nivelLog >= nivelBasico) {
            verificarNivelLog("", messagem);//é responsável por escrever uma mensagem de log no arquivo de log
        }
    }

    //mensagem de aviso
    public static void logAviso(String messagem) {
        if (nivelLog >= nivelMedio) {
            verificarNivelLog("escreva sua mensagem de aviso", messagem);
        }
    }

    //mensagem de informação 
    public static void logInfomacao(String messagem) {
        if (nivelLog >= nivelErro) {
            verificarNivelLog("escreva sua informacao", messagem);
        }
    }

    //Esse método define o nível de log que será usado para determinar quais 
    //mensagens serão registradas no log
    public static void setNivelLog(Integer nivel) {
        nivelLog = nivel;
    }

    //metodo que escreve no meu log 
     public static void verificarNivelLog(String nivel, String messagem) {
        validaRotacaoLog();

        try {
            writer.write(getDateTimeAtual() + " [" + nivel + "] " + messagem);
            writer.newLine();//inserir uma nova linha após cada mensagem de log.
            writer.flush(); //é chamado para garantir que os dados sejam escritos imediatamente no arquivo.
            //tamanhoAtualLog += messagem.length();

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }

    //retorna a data e hora atual formatada 
    private static String getDateTimeAtual() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datatime);
        return dateFormat.format(new Date());
    }

    //Métodos para controle de rotação de logs: 
    //Verifica se é necessário fazer a rotação dos logs
    //aqui a gente olha o tamanho do arquivo
    //synchronized -> espera tudo terminar para fazer a próxima interacão
    private static synchronized void validaRotacaoLog() {
        tamanhoAtualLog = new File(nomeArquivo + ".txt").length();
        if (writer == null) {
            //closeWriter();
            //rotateLogs();
            nomeArquivo = getNomeArquivoLog(1);
            iniciarWriter();
        } else if (tamanhoAtualLog >= tamanhoMaximoArquivo) {
            fecharWriter();
            rotacionaLog();
            iniciarWriter();
        }
    }

    //Renomeia os arquivos de log antigos com base em sua numeração
    //gera o arquivo baseado em data
    private static void rotacionaLog() {
        /*for (int i = 9; i > 0; i--) {
            String nomeAntigo = getNomeArquivoLog(i);
            String nomeNovo = getNomeArquivoLog(i + 1);
            renomearArquivo(nomeAntigo, nomeNovo);
        }*/

        String nomeInicial = getNomeArquivoLog(2);
        renomearArquivo(nomeArquivo, nomeInicial);
    }

    private static String getNomeArquivoLog(Integer numero) {
        if (numero == 1) {
            return nomeArquivo;
        } else {
            //return nomeArquivo + "." + (numero - 1);
            return nomeArquivo + "." + getDateTimeAtual();
        }
    }

    //Renomeia um arquivo de log mv(terminal)
    private static void renomearArquivo(String nomeAntigo, String nomeNovo) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("mv", nomeAntigo + ".txt", nomeNovo + ".txt");
            processBuilder.start();
        } catch (IOException e) {
            System.err.println("Erro ao renomear arquivo de log: " + e.getMessage());
        }
    }

    //Métodos para abrir e fechar o arquivo de log: 
    private static void iniciarWriter() {
        try {
            writer = new BufferedWriter(new FileWriter(nomeArquivo + ".txt", true));
            tamanhoAtualLog = 0;
        } catch (IOException e) {
            System.err.println("Erro ao abrir arquivo de log: " + e.getMessage());
        }
    }

    private static void fecharWriter() {
        try {
            if (writer != null) {
                writer.close();
            }
            //erro caso
        } catch (IOException e) {
            System.err.println("Erro ao fechar arquivo de log: " + e.getMessage());
        }
    }
}

