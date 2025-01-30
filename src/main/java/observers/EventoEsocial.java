package src.main.java.observers;

import src.main.java.models.Funcionario;

import java.util.Observable;
import java.util.Observer;

public class EventoEsocial implements Observer {

    private Funcionario funcionario;
    private String ultimaAlteracao;

    public EventoEsocial(Funcionario funcionario) {
        this.funcionario = funcionario;
        funcionario.addObserver(this);
    }

    public String getultimaAlteracao() {
        return this.ultimaAlteracao;
    }

    @Override
    public void update(Observable funcionario, Object arg) {
        this.ultimaAlteracao = funcionario.toString() + " - Aguardando processamento.";
    }
}