package exercicios.TesteDeSoftware.contacorrente.test;

import exercicios.TesteDeSoftware.contacorrente.ContaCorrente;
import org.junit.jupiter.api.BeforeEach;


public class TestaContaCorrente {
    private ContaCorrente contaCorrente;

    @BeforeEach
    public void initIntances() {
        contaCorrente = new ContaCorrente("messyas", "conta", 2000);
    }



}
