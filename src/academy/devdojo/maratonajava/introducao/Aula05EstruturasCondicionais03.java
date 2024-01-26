package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500  conto pro messyas";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        //(condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000 ? mensagemDoar : mensagemNaoDoar);
       /* if(salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/
        System.out.println(resultado);
        // da pra fazer
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
        System.out.println(salario >= 5500 ? "Posso dar 10 casas pra voce" : "Sou pobre e nao que ajudar ");
    }
}
