package academy.devdojo.maratonajava.Javacore.enumeracies.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    public abstract double calcularDesconto(double valor);
}
