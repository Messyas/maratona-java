package academy.devdojo.maratonajava.Javacore.heranca.test;

import academy.devdojo.maratonajava.Javacore.heranca.dominio.Funcionario;

/**
 * 0 - Bloco de inicializacao estatico da super classe é exucutado quando a jvm carreagar a superclasse
 * 1 - Bloco de inicializacao estatico da subclasse é exucutado quando a jvm carretar a filha
 * 2 - alocado espaco em memoria pro objeto da superclasse
 * 3 - cada atributo da superclasse é criado e inicializado com valores defoult ou que for passado da superclasse
 * 4 - Bloco de inicializacao da superclasse é executado na ordem em que aparece
 * 5 - Construtor da superclasse é executado
 * 6 - alocado espaco em memoria pro objeto da superclasse
 * 7 - cada atributo da subclasse é criado e inicializado com valores defoult ou que for passado da subclasse
 * 8 - Bloco de inicializacao da subclasse é executado na ordem em que aparece
 * 9 - Construtor da supclasse é executado
 */
public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Messyas");//jvm ve que é uma subclasse e roda primeiro o bloco estatico de pessoa
    }
}
