package src.main.java.models;

import src.main.java.factory.FuncionarioEstadoFactory;

public class FuncionarioEstadoExperiencia extends FuncionarioEstado {

    @Override
    public String getEstado() {
        return "Em experiencia";
    }

    @Override
    public Integer getCodigoEstado() {
        return 2200;
    }


    public boolean ativo (Funcionario f) {
        f.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        return true;
    }

    public boolean desligado (Funcionario f) {
        f.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        return true;
    }

    public boolean suspenso (Funcionario f) {
        f.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        return true;
    }

    public boolean afastado (Funcionario f) {
        f.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        return true;
    }
}