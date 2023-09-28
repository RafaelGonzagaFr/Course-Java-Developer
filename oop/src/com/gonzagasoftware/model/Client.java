package com.gonzagasoftware.model;

public class Client {
    //construtor
    private String name;
    private String CPF;

    Client(String name, String CPF){

        setName(name);
        setCPF(CPF);
    }


    //(GETTERS AND SETTERS) - Encapsulamento
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
