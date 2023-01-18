package com.eventoapp.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eventos implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
 

    private String nome;
    private String local;
    private String data;
    private String horario;
    


    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }


    //getters
    public String getNome() {
        return nome;
    }
    public String getLocal() {
        return local;
    }
    public String getData() {
        return data;
    }
    public String getHorario() {
        return horario;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    
    
}
