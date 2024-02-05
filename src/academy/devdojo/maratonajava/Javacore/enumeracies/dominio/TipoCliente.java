package academy.devdojo.maratonajava.Javacore.enumeracies.dominio;

/**
 * enumeracoes sao tipos de classes onde todos os atributos criados sao constantes, elas nao possuem tipo, o seu tipo é definido pela classe
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int valor;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
          for(TipoCliente tipoCliente : values()) {
              if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                  return tipoCliente;
              }
          }
          return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
