package src.test.java;

import src.main.java.models.Funcionario;
import src.main.java.observers.EventoEsocial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class EventoEsocialTest {


    @Test
    public void geraEventoParaFuncionarioQueSeraAfastado() {
        Funcionario funcionario = new Funcionario("Maria", "Ativo");
        EventoEsocial evento = new EventoEsocial(funcionario);

        if(funcionario.afastado()) {
            funcionario.gerarEvento();
        }

        assertEquals("Nome: Maria - Evento 2230 - Aguardando processamento.", evento.getultimaAlteracao());
    }

    @Test
    public void naoGeraEventoParaFuncionarioAtivo() {
        Funcionario funcionario = new Funcionario("Maria", "Ativo");
        EventoEsocial evento = new EventoEsocial(funcionario);

        if(funcionario.ativo()) {
            funcionario.gerarEvento();
        }

        assertNull(evento.getultimaAlteracao());
    }

    @Test
    public void geraEventoParaDoisFuncionarios() {
        Funcionario funcionario_01 = new Funcionario("Maria", "Ativo");
        EventoEsocial evento_01 = new EventoEsocial(funcionario_01);

        Funcionario funcionario_02 = new Funcionario("João", "Experiencia");
        EventoEsocial evento_02 = new EventoEsocial(funcionario_02);

        if(funcionario_01.ferias()) {
            funcionario_01.gerarEvento();
        }

        if(funcionario_02.ferias()) {
            funcionario_02.gerarEvento();
        }

        assertEquals("Nome: Maria - Evento 2230 - Aguardando processamento.", evento_01.getultimaAlteracao());
        assertNull(evento_02.getultimaAlteracao());
    }
}

