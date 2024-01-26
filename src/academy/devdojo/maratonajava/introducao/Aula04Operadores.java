package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Sao elementos que permitem fazer operacoes
        // + - / *
        // o resultado entre 2 numeros inteiros é um numero inteiro, oq significa que um resultado double nao recebe uma operacao aritmetica de inteiros. so se fize casting.
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double)numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores logicos, estes sempre retornam um valor booleano, sao eles:
        // < , > , <= , >=, ==, !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20; // that is False
        boolean isDezMenorQueVinte = 10 < 20; // that is True
        boolean isDezIgualVinte = 10 == 20; // that is False
        boolean isDezDiferenteVinte = 10 != 20; // that True
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        //Operadores Logicos
        // && (End) algo e mais algo), || (or) algo ou algo, ! (Logical not) escalacao
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystration = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystration || valorTotalContaPoupanca > valorPlaystration;
        System.out.println("Its possible to buy the playstation 5? " + isPlaystationCincoCompravel);

        //Operadores de Atribuicao

        // = += -= *= /= %=

        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;//2800
        bonus -= 1000;//1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //Contador
        int contador = 0;
        //contador += 1; //operador depois, primeiro execute depois incremente
        contador ++;// incremento
        contador --;// decremento
        //operador antes, primeiro incremente depois execute
        ++contador;
        --contador;//

        int contador2 = 0;
        System.out.println(contador2);
        System.out.println(contador);

    }
}
