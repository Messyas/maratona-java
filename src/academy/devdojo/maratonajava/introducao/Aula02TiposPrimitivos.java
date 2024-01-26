package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idadegrandecasting = (int) 1000000000l;//casting, forcar uma variavel menor receber um valor maior, mas com a conseguencia de serem retirados os valores que excedem os da variavel
        int age = 78;
        long numeroGrande = 100000l;
        double salarioDouble = 2000.0D;
        float salariofloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        //String nao é um tipo primitivo, é um tipo de referencia, reference type.
        //String no java é uma classe, por isso comeca com letra maiuscula
        String nome = "Goku";

        //para concatenar o valor de uma variavel com texto use o +
        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(idadegrandecasting);
        //atalho para println (sout)
        System.out.println("Oi meu nome é "+nome);
    }
}
