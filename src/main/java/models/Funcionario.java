package src.main.java.models;

import src.main.java.factory.FuncionarioEstadoFactory;

import java.util.Observable;


public class Funcionario extends Observable {

    private String nome;
    private FuncionarioEstado estado;


    public Funcionario(String nome, String estado) {
        this.nome = nome;
        this.estado = FuncionarioEstadoFactory.tipoEstado(estado);
    }


    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public FuncionarioEstado getEstado() {
        return this.estado = estado;
    }


    public boolean ativo () {
        return estado.ativo(this);
    }

    public boolean experiencia () {
        return estado.experiencia(this);
    }

    public boolean afastado () {
        return estado.afastado(this);
    }

    public boolean ferias () {
        return estado.ferias(this);
    }

    public boolean suspenso () {
        return estado.suspenso(this);
    }

    public boolean desligado () {
        return estado.desligado(this);
    }


    // Observable
    // Esse metodo nao pode ficar no set porque nem toda alteração de estado gera um evento

    public void gerarEvento() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Evento " + estado.getCodigoEstado();
    }


}

