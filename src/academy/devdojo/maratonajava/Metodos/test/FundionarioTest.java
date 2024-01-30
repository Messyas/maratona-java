package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.model.Funcionario;

public class FundionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Messyas";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{20.000, 14.000, 5.000};

        funcionario.imprimirDados();


    }
}
