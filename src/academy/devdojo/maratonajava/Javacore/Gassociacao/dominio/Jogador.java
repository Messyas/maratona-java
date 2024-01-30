package academy.devdojo.maratonajava.Javacore.Gassociacao.dominio;

/**
 * associacao, unidirecional: 1:1
 */
public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {//se quiser que tenha um time obrigatoriamente, basta add no constructor
        System.out.println(this.nome);
        if(time != null){//é necessario saber se existe o objeto para nao dar null pointer exception
            System.out.println(time.getNome());//time é um objeto
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
