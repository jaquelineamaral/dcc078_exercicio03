package src.test.java;

import src.main.java.factory.FuncionarioEstadoFactory;
import src.main.java.models.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario("Maria", "Ativo");
    }


    // Teste FuncionarioEstadoFactory

    @Test
    void EstadoInexistente() {
        try {
            FuncionarioEstadoFactory.tipoEstado("Teste");
            fail("Era pra ter sido lançado uma exeção");
        } catch (IllegalArgumentException e) {
            assertEquals("Estado inexistente", e.getMessage());
        }
    }


    // Funcionário afastado

    @Test
    public void naoAfastaFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertFalse(funcionario.afastado());
    }

    @Test
    public void naoDesligaFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertFalse(funcionario.desligado());
    }

    @Test
    public void naoColocaEmExperienciaFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void naoColocaDeFeriasFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoSuspendeFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertFalse(funcionario.suspenso());
    }

    @Test
    public void ativaFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Afastado"));
        assertTrue(funcionario.ativo());
        assertEquals("Ativo", funcionario.getEstado().getEstado());
    }

    // Funcionário ativo

    @Test
    public void naoAtivaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertFalse(funcionario.ativo());
    }

    @Test
    public void naoColocaEmExperienciaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void colocaDeFeriasFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertTrue(funcionario.ferias());
        assertEquals("Férias", funcionario.getEstado().getEstado());
    }

    @Test
    public void suspendeFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertTrue(funcionario.suspenso());
        assertEquals("Suspenso", funcionario.getEstado().getEstado());
    }

    @Test
    public void afastaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertTrue(funcionario.afastado());
        assertEquals("Afastado", funcionario.getEstado().getEstado());
    }

    @Test
    public void desligaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ativo"));
        assertTrue(funcionario.desligado());
        assertEquals("Desligado", funcionario.getEstado().getEstado());
    }


    // Funcionário desligado

    @Test
    public void naoDesligaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.ativo());
    }

    @Test
    public void naoAtivaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.ativo());
    }

    @Test
    public void naoColocaEmExperienciaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void naoColocaDeFeriasFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoSuspendeFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.suspenso());
    }

    @Test
    public void naoAfastaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Desligado"));
        assertFalse(funcionario.afastado());
    }


    // Funcionário em experiência

    @Test
    public void naoColocaEmExperienciaFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void naoColocaDeFeriasFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertFalse(funcionario.ferias());
    }

    @Test
    public void suspendeFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertTrue(funcionario.suspenso());
        assertEquals("Suspenso", funcionario.getEstado().getEstado());
    }

    @Test
    public void ativaFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertTrue(funcionario.ativo());
        assertEquals("Ativo", funcionario.getEstado().getEstado());
    }

    @Test
    public void desligaFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertTrue(funcionario.desligado());
        assertEquals("Desligado", funcionario.getEstado().getEstado());
    }

    @Test
    public void afastaFuncionarioEmExperiencia() {
        funcionario = new Funcionario("João", "Experiencia");
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Experiencia"));
        assertTrue(funcionario.afastado());
        assertEquals("Afastado", funcionario.getEstado().getEstado());
    }


    // Funcionário de férias

    @Test
    public void naoColocaDeFeriasFuncionarioEmFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoDesligaFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertFalse(funcionario.desligado());
    }

    @Test
    public void naoColocaEmExperienciaFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void naoAfastaFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertFalse(funcionario.afastado());
    }

    @Test
    public void naoSuspendeFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertFalse(funcionario.suspenso());
    }

    @Test
    public void ativaFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Ferias"));
        assertTrue(funcionario.ativo());
        assertEquals("Ativo", funcionario.getEstado().getEstado());
    }


    // Funcionário suspenso

    @Test
    public void naoSuspendeFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertFalse(funcionario.suspenso());
    }

    @Test
    public void naoDesligaFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertFalse(funcionario.desligado());
    }

    @Test
    public void naoColocaEmExperienciaFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertFalse(funcionario.experiencia());
    }

    @Test
    public void naoAfastaFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertFalse(funcionario.afastado());
    }

    @Test
    public void naoColocaDeFeriasFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertFalse(funcionario.ferias());
    }

    @Test
    public void ativaFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoFactory.tipoEstado("Suspenso"));
        assertTrue(funcionario.ativo());
        assertEquals("Ativo", funcionario.getEstado().getEstado());
    }

}
