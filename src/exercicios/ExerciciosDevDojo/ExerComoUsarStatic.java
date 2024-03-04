package exercicios.ExerciciosDevDojo;

public class ExerComoUsarStatic {
    //variavel estatica
    public static int contador = 0;//o valor é modificado para qualquer instancia da classe
    //Exemplo de uso com constantes
    /**\
     * public class Constantes {
     *     public static final double PI = 3.14159; // o final faz com que o valor nao possa ser alterado em tempo de execucao
     *     public static final int NUMERO_MAXIMO_DE_CLIENTES = 100;
     * }
     */
//casos de uso

    //metodo estatico
    public static void incremetarContador() {
        contador++;
    }

    //metodo nao estatico
    public void exibirContardor() {
        System.out.println("Contador " + contador);
    }

    /**
     * Contadores e Rastreadores Globais: Quando você precisa rastrear informações globais sobre todas as instâncias de uma
     * classe, como um contador de instâncias, é útil usar membros estáticos.
     *
     * public class Contador {
     *     private static int contadorDeInstancias = 0;
     *
     *     public Contador() {
     *         contadorDeInstancias++;
     *     }
     *
     *     public static int getContadorDeInstancias() {
     *         return contadorDeInstancias;
     *     }
     * }
     */

    /**
     *Métodos Utilitários: Se você tem métodos que não dependem do estado de instância da classe e podem ser compartilhados
     * entre todas as instâncias, é aconselhável torná-los estáticos. Por exemplo:
     */
    //exemplos de uso
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double calcularAreaDoCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    /**
     * Padrão Singleton: Quando você precisa garantir que uma classe tenha apenas uma única instância e quer
     * fornecer um ponto de acesso global a essa instância, pode usar membros estáticos para implementar o padrão Singleton.
     *
     * public class Singleton {
     *     private static Singleton instancia = new Singleton();
     *
     *     private Singleton() {
     *         // Construtor privado para evitar instanciação externa
     *     }
     *
     *     public static Singleton getInstancia() {
     *         return instancia;
     *     }
     * }
     */

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
