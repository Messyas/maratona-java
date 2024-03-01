package exercicios.TesteDeSoftware.contacorrente.test;

import exercicios.TesteDeSoftware.contacorrente.ContaCorrente;
import exercicios.TesteDeSoftware.contacorrente.SaldoInsuficienteException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ContaCorrenteTest {
    private ContaCorrente contaCorrente;

    @BeforeEach
    public void initIntances() {
        contaCorrente = new ContaCorrente("messyas", "conta", 2000);
    }

    @DisplayName("Teste do metodo Depositar")
    @Test
    public void testDeposita() {
        assertTrue(contaCorrente.deposita(500.0f));
        assertEquals(2500.0f, contaCorrente.getSaldo(), 0.001);

        assertFalse(contaCorrente.deposita(-100.0f));
        assertEquals(2500.0f, contaCorrente.getSaldo(), 0.001);
    }

    @DisplayName("Teste do metodo saque")
    @Test
    public void testarSaque() {
        try {
            assertTrue(contaCorrente.saque(500.0f));
            assertEquals(1500.0f, contaCorrente.getSaldo(), 0.001);
        } catch (SaldoInsuficienteException e) {
            fail("Excecao nao esperada: " + e.getMessage());
        }

        assertThrows(SaldoInsuficienteException.class, () ->contaCorrente.saque(-100.0f)); //Nao passou com valores negativos
        assertThrows(SaldoInsuficienteException.class, () -> contaCorrente.saque(2000.0f));
    }

    @Test
    public void testaSaqueInsuficienteException() {
        assertThrows(SaldoInsuficienteException.class, () -> contaCorrente.saque(3000.0f));
    }



}
