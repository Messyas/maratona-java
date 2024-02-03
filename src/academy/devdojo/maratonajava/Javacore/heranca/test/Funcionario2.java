package academy.devdojo.maratonajava.Javacore.heranca.test;

import academy.devdojo.maratonajava.Javacore.heranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {
    public void imprime() {
        this.nome = "sasa ";//neste caso protected nao funciona por estar em um packege distinto
    }
}
