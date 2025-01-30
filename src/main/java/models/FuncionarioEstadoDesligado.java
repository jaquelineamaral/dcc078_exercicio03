package src.main.java.models;

public class FuncionarioEstadoDesligado extends FuncionarioEstado {

    @Override
    public String getEstado() {
        return "Desligado";
    }

    @Override
    public Integer getCodigoEstado() {
        return 2299;
    }
}
