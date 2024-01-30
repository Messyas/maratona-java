package academy.devdojo.maratonajava.Metodos.test;

import academy.devdojo.maratonajava.Metodos.model.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Messyas");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{20.000, 14.000, 5.000});
        funcionario.imprimirDados();

        System.out.println("media " + funcionario.getMedia());


    }
}
