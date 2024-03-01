package exercicios.TesteDeSoftware.contacorrente.test;

import exercicios.TesteDeSoftware.contacorrente.ContaCorrente;
import exercicios.TesteDeSoftware.contacorrente.OperacaoIlegalException;
import exercicios.TesteDeSoftware.contacorrente.SaldoInsuficienteException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ContaCorrenteTest {
    private ContaCorrente contaCorrente;
    private ContaCorrente contaOrigem;
    private ContaCorrente contaDestino;

    @BeforeEach
    public void initIntances() {
        contaCorrente = new ContaCorrente("messyas", "conta", 2000);

        contaOrigem = new ContaCorrente("Joao", "12345", 2000);
        contaDestino = new ContaCorrente("Maria", "67890", 1000);
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
    public void testSaque() {
        try {
            assertTrue(contaCorrente.saque(500.0f));
            assertEquals(1500.0f, contaCorrente.getSaldo(), 0.001);
        } catch (SaldoInsuficienteException e) {
            fail("Excecao nao esperada: " + e.getMessage());
        }

        assertThrows(SaldoInsuficienteException.class, () ->contaCorrente.saque(-100.0f)); //Nao passou com valores negativos inicialmente
        assertThrows(SaldoInsuficienteException.class, () -> contaCorrente.saque(2000.0f));
    }

    @DisplayName("Teste de lancamento de exececao para saldo insuficiente")
    @Test
    public void testSaqueInsuficienteException() {
        assertThrows(SaldoInsuficienteException.class, () -> contaCorrente.saque(3000.0f));
    }

    @DisplayName("Teste de transferencia bancaria bem sucedida")
    @Test
    public void testTransferenciaSucesso() {
        try {
            contaOrigem.transferencia(contaDestino, 500.0f);
            assertEquals(1500.0f, contaOrigem.getSaldo(), 0.001);
            assertEquals(1500.0f, contaDestino.getSaldo(), 0.001);
        } catch (OperacaoIlegalException | SaldoInsuficienteException e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }

    @DisplayName("Teste de transferencia em que o saldo é insuficiente")
    @Test
    public void testTransferenciaSaldoInsuficiente() {
        // Tenta transferir mais do que o saldo da conta de origem
        assertThrows(OperacaoIlegalException.class, () -> contaOrigem.transferencia(contaDestino, 3000.0f));
        // Verifica se os saldos permanecem inalterados
        assertEquals(2000.0f, contaOrigem.getSaldo(), 0.001);
        assertEquals(1000.0f, contaDestino.getSaldo(), 0.001);
    }

    @DisplayName("Teste de transferencia em que o saldo é igual ao saque")
    @Test
    public void testTransferenciaSaldoExato() {
        try {
            contaOrigem.transferencia(contaDestino, 2000.0f);
            assertEquals(0.0f, contaOrigem.getSaldo(), 0.001);
            assertEquals(3000.0f, contaDestino.getSaldo(), 0.001);
        } catch (OperacaoIlegalException | SaldoInsuficienteException e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }

    @DisplayName("Teste de transferencia com valor negativo")
    @Test
    public void testTransferirValorNegativo() {
        // Tenta transferir um valor negativo
        assertThrows(OperacaoIlegalException.class, () -> contaOrigem.transferencia(contaDestino, (float) -500.0));
        // Verifica se os saldos permanecem inalterados
        assertEquals(2000.0, contaOrigem.getSaldo(), 0.001);
        assertEquals(1000.0, contaDestino.getSaldo(), 0.001);
    }

    @DisplayName("Teste de transferencia para a mesma conta")
    @Test
    public void testTransferenciaParaMesmaConta() {
        assertThrows(OperacaoIlegalException.class, () -> contaOrigem.transferencia(contaOrigem, 100.0f));//falhou no primeiro teste
        assertEquals(2000.0f, contaOrigem.getSaldo(), 0.001);
    }
}
