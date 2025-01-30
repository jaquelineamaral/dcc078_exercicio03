package src.main.java.models;

import src.main.java.factory.FuncionarioEstadoFactory;

public class FuncionarioEstadoAfastado extends FuncionarioEstado {

    @Override
    public String getEstado() {
        return "Afastado";
    }

    @Override
    public Integer getCodigoEstado() {
        return 2230;
    }


    public boolean ativo (Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        return true;
    }
}

