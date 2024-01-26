package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) { //enquanto a expressao for verdadeira
            System.out.println(++count);//incrementa 1 imprime e volta pro laço
        }
        count = 0;
        do {// idempendente da condico, o bloco vai ser executado pelo menos uma vez
            System.out.println("Dentro do do-while "+ ++count);
        } while (count < 10);// se a expressao for satisfesta o bloco roda novamente

        //for
        for(int i = 0; i < 10 ; i++) {
            System.out.println("For "+ i);

        }
        for ( int i = 1 ; i < 11; i++) {

        }

    }
}
