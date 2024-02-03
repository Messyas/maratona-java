package academy.devdojo.maratonajava.Javacore.enumeracies.dominio;

public class Cliente {
    private String nome;
    //essa associacao entre a classe enum e a classe desejada permite que as enumeracoes sejam acessadas
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
//  private String tipo;
    //public static final String PESSOA_FISICA = "PESSOA_FISICA";
   // public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    //public Cliente(String nome, String tipo) {
       // if(tipo.equalsIgnoreCase(PESSOA_FISICA) == false && tipo.equalsIgnoreCase(PESSOA_JURIDICA) == false) forma menos inteligente de fazer isso x forma abilio:
      //  if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
          //  return;// isso nao é considerado uma boa pratica, justamente para lidar com estes casos existem enumeracoes
       // }
      //  this.nome = nome;
       // this.tipo = tipo;
    //}


