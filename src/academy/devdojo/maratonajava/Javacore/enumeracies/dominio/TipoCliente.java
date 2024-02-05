package academy.devdojo.maratonajava.Javacore.enumeracies.dominio;

/**
 * enumeracoes sao tipos de classes onde todos os atributos criados sao constantes, elas nao possuem tipo, o seu tipo é definido pela classe
 */
public enum TipoCliente {
    PESSOA_FISICA(1, " Pessoa fisica"),
    PESSOA_JURIDICA(2, " Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
