package src.main.java.models;

public abstract class FuncionarioEstado {

    public abstract String getEstado();
    public abstract Integer getCodigoEstado();


    public boolean ativo (Funcionario funcionario) {
        return false;
    }

    public boolean experiencia (Funcionario funcionario) {
        return false;
    }

    public boolean afastado (Funcionario funcionario) {
        return false;
    }

    public boolean ferias (Funcionario funcionario) {
        return false;
    }

    public boolean suspenso (Funcionario funcionario) {
        return false;
    }

    public boolean desligado (Funcionario funcionario) {
        return false;
    }
}
