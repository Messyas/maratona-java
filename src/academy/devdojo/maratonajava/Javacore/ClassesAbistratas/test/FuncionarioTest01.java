package academy.devdojo.maratonajava.Javacore.ClassesAbistratas.test;

import academy.devdojo.maratonajava.Javacore.ClassesAbistratas.Dominio.Desenvolvedor;
import academy.devdojo.maratonajava.Javacore.ClassesAbistratas.Dominio.Funcionario;
import academy.devdojo.maratonajava.Javacore.ClassesAbistratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
     //   Funcionario funcionario = new Funcionario("Zoro", 20000);
        Gerente gerente = new Gerente("Nami",144000);

        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Messyas",12000);

        System.out.println(desenvolvedor);
    }
}
