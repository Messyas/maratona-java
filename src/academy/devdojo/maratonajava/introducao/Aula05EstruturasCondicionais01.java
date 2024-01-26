package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a beber refrigerante ");
        } else {
            System.out.println("Nao autorizado a beber refrigerante ");
        }
        if(!isAutorizadoComprarBebida) {// o operador ! gera uma inversao logica da expressao
            //é a mesmas coisa que if(isAutorizadoComprarBebida == false)
            System.out.println("Nao Autorizado a beber Refrigerante ");
        }
        boolean c = true;
        if (c = false) { //como o if so executa se a expressao for verdadeira, neste caso, o bloco nao sera executado.
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        boolean b = false;
        if (b = true) { //agora nesse caso a expressao é executada pois foi verificada que é verdadeira.
            System.out.println("Dentro de algo que nunca deve ser feito 2");
        }

        System.out.println("Fora do if");
    }
}
