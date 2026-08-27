
package com.abrigo.model;

import java.util.Date;


public class Animal {
    private String nome;
    private int idade;
    private Date dataNascimento;
    private String sexo;
    private String statusVacinacao;
    private String statusGravidez;



    public String getStatusGravidez() {
        return statusGravidez;
    }

    public void setStatusGravidez(String statusGravidez) {
        this.statusGravidez = statusGravidez;
    }




    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatusVacinacao() {
        return statusVacinacao;
    }

    public void setStatusVacinacao(String statusVacinacao) {
        this.statusVacinacao = statusVacinacao;
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
