package academy.devdojo.maratonajava.Javacore.Hheranca.test;

import academy.devdojo.maratonajava.Javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.Javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.Javacore.Hheranca.dominio.Pessoa;

public class HeranraTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyoshisa shimazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario("Messyas gois franca");
        funcionario.setCpf("1231123232");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20.0000);
        System.out.println("----------------------");
        funcionario.imprime();
    }
}
