package exercicios.TesteDeSoftware.contacorrente.model;

public class OperacaoIlegalException extends IllegalStateException {

    public OperacaoIlegalException(String message) {
        super(message);
    }
}