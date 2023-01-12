package com.eventoapp.lista.models;

public class Evento {

    private String nome;
    private String local;
    private String data;
    private String horaio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraio() {
        return horaio;
    }

    public void setHoraio(String horaio) {
        this.horaio = horaio;
    }
}
