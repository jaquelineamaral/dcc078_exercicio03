package src.main.java.factory;

import src.main.java.models.FuncionarioEstado;


public class FuncionarioEstadoFactory {

    public static FuncionarioEstado tipoEstado(String estado) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("src.main.java.models.FuncionarioEstado" + estado);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Estado inexistente");
        }
        if (!(objeto instanceof FuncionarioEstado)) {
            throw new IllegalArgumentException("Estado inválido");
        }
        return (FuncionarioEstado) objeto;
    }

}
