package src.main.java.models;

import src.main.java.factory.FuncionarioEstadoFactory;

public class FuncionarioEstadoFerias extends FuncionarioEstado {

    @Override
    public String getEstado() {
        return "Férias";
    }

    @Override
    public Integer getCodigoEstado() {
        return 2230;
    }


    public boolean ativo (Funcionario f) {
        f.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        return true;
    }
}
