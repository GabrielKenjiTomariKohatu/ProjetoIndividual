package classes.tabelas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel Kohatu
 */
public class Dados {
    private Integer memoriaRAMTotal;
    private Integer memoriaRAMEmUso;
    private Double cpuUtilizacao; 
    private Integer cpuProcessos;
    private Integer armazenamentoTotal;
    private String redeHostname;
    private String redeServerDnsIpv4;

    public Dados(Integer memoriaRAMTotal, Integer memoriaRAMEmUso, Double cpuUtilizacao, Integer cpuProcessos, Integer armazenamentoTotal, String redeHostname, String redeServerDnsIpv4) {
        this.memoriaRAMTotal = memoriaRAMTotal;
        this.memoriaRAMEmUso = memoriaRAMEmUso;
        this.cpuUtilizacao = cpuUtilizacao;
        this.cpuProcessos = cpuProcessos;
        this.armazenamentoTotal = armazenamentoTotal;
        this.redeHostname = redeHostname;
        this.redeServerDnsIpv4 = redeServerDnsIpv4;
    }

    public Integer getMemoriaRAMTotal() {
        return memoriaRAMTotal;
    }

    public void setMemoriaRAMTotal(Integer memoriaRAMTotal) {
        this.memoriaRAMTotal = memoriaRAMTotal;
    }

    public Integer getMemoriaRAMEmUso() {
        return memoriaRAMEmUso;
    }

    public void setMemoriaRAMEmUso(Integer memoriaRAMEmUso) {
        this.memoriaRAMEmUso = memoriaRAMEmUso;
    }

    public Double getCpuUtilizacao() {
        return cpuUtilizacao;
    }

    public void setCpuUtilizacao(Double cpuUtilizacao) {
        this.cpuUtilizacao = cpuUtilizacao;
    }

    public Integer getCpuProcessos() {
        return cpuProcessos;
    }

    public void setCpuProcessos(Integer cpuProcessos) {
        this.cpuProcessos = cpuProcessos;
    }

    public Integer getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    public void setArmazenamentoTotal(Integer armazenamentoTotal) {
        this.armazenamentoTotal = armazenamentoTotal;
    }

    public String getRedeHostname() {
        return redeHostname;
    }

    public void setRedeHostname(String redeHostname) {
        this.redeHostname = redeHostname;
    }

    public String getRedeServerDnsIpv4() {
        return redeServerDnsIpv4;
    }

    public void setRedeServerDnsIpv4(String redeServerDnsIpv4) {
        this.redeServerDnsIpv4 = redeServerDnsIpv4;
    }

    @Override
    public String toString() {
        return "Dados{" + "memoriaRAMTotal=" + memoriaRAMTotal + ", memoriaRAMEmUso=" + memoriaRAMEmUso + ", cpuUtilizacao=" + cpuUtilizacao + ", cpuProcessos=" + cpuProcessos + ", armazenamentoTotal=" + armazenamentoTotal + ", redeHostname=" + redeHostname + ", redeServerDnsIpv4=" + redeServerDnsIpv4 + '}';
    }
    
    
}
