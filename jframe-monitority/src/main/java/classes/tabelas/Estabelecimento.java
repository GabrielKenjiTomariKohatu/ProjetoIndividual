/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.tabelas;

/**
 *
 * @author Gabriel Kohatu
 */
public class Estabelecimento {
    private Integer idEstabelecimento;
    private String nome;
    private Integer fkEmpresa;
    private Integer fkEndereco;
    private Integer fkMetricaAviso;


    public Integer getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Integer idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(Integer fkEndereco) {
        this.fkEndereco = fkEndereco;
    }

    public Integer getFkMetricaAviso() {
        return fkMetricaAviso;
    }

    public void setFkMetricaAviso(Integer fkMetricaAviso) {
        this.fkMetricaAviso = fkMetricaAviso;
    }

  
    @Override
    public String toString() {
        return "Estabelecimento{" + "idEstabelecimento=" + idEstabelecimento + ", nome=" + nome + ", fkEmpresa=" + fkEmpresa + ", fkEndereco=" + fkEndereco + ", fkMetricaAviso=" + fkMetricaAviso + '}';
    }
    
    
    
    
}
