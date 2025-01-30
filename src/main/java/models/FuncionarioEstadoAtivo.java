package src.main.java.models;

import src.main.java.factory.FuncionarioEstadoFactory;

public class FuncionarioEstadoAtivo extends FuncionarioEstado {

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public Integer getCodigoEstado() {
        return 2200;
    }


    public boolean afastado(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        return true;
    }

    public boolean ferias(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        return true;
    }

    public boolean suspenso(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        return true;
    }

    public boolean desligado(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        return true;
    }

}