/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.tabelas;

/**
 *
 * @author Gabriel Kohatu
 */
public class Totem {
    private Integer idTotem;
    private String modelo;
    private Integer totalIncidentes;
    private String serialTotem;
    private Integer fkConfigPc;
    private Integer fkEstabelecimento;
 

    public Integer getIdTotem() {
        return idTotem;
    }

    public void setIdTotem(Integer idTotem) {
        this.idTotem = idTotem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTotalIncidentes() {
        return totalIncidentes;
    }

    public void setTotalIncidentes(Integer totalIncidentes) {
        this.totalIncidentes = totalIncidentes;
    }

    public String getSerialTotem() {
        return serialTotem;
    }

    public void setSerialTotem(String SerialTotem) {
        this.serialTotem = SerialTotem;
    }

    public Integer getFkConfigPc() {
        return fkConfigPc;
    }

    public void setFkConfigPc(Integer fkConfigPc) {
        this.fkConfigPc = fkConfigPc;
    }

    public Integer getFkEstabelecimento() {
        return fkEstabelecimento;
    }

    public void setFkEstabelecimento(Integer fkEstabelecimento) {
        this.fkEstabelecimento = fkEstabelecimento;
    }

    @Override
    public String toString() {
        return "Totem{" + "idTotem=" + idTotem + ", modelo=" + modelo + ", totalIncidentes=" + totalIncidentes + ", SerialTotem=" + serialTotem + ", fkConfigPc=" + fkConfigPc + ", fkEstabelecimento=" + fkEstabelecimento + '}';
    }
    
    
}
