package exercicios.ExerciciosDevDojo;

public class ExerComoUsarStatic {
    //variavel estatica
    public static int contador = 0;//o valor é modificado para qualquer instancia da classe
    //metodo estatico
    public static void incremetarContador() {
        contador++;
    }

    //metodo nao estatico
    public void exibirContardor() {
        System.out.println("Contador " + contador);
    }

    public static void main(String[] args) {
        //acessando membros estaticos diremente
        ExerComoUsarStatic.incremetarContador();// a classe executa a funcao para a variavel em si mesma, ou seja o statica faz com que os atributos passem a pertencer a classe e nao a objetos
        ExerComoUsarStatic.incremetarContador();

        ExerComoUsarStatic object01 = new ExerComoUsarStatic();
        object01.exibirContardor();

        ExerComoUsarStatic object02 = new ExerComoUsarStatic();
        object02.exibirContardor();
    }

}
