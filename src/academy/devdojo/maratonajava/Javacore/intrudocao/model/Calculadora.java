package academy.devdojo.maratonajava.Javacore.intrudocao.model;

public class Calculadora {


    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    //varargs
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros) {
            soma += num;
        }
    }
}
