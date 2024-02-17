package exercicios.ListaDePOO.Exercicio15;

import java.util.Scanner;

public class PrincipalPessoa {

    public Pessoa pessoa;

    public static void main(String[] args) {

        PrincipalPessoa principalPessoa = new PrincipalPessoa();
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("-------- Seja bem vindo ---------");
            System.out.println("---------------------------------");
            System.out.println("\n");
            System.out.println("Digite para selecionar as opções");
            System.out.println("Cadastrar Dados [1] ");
            System.out.println("Imprimir Dados  [2] ");
            input = scanner.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Digite o seu nome");
                    String nome = scanner.next(); // Alterado para next()
                    System.out.println("Digite o seu cpf");
                    String cpf = scanner.next(); // Alterado para next()
                    System.out.println("Digite a sua data de nascimento");
                    String dataNasc = scanner.next(); // Alterado para next()
                    if(dataNasc.length() != 10) {
                        System.out.println("Data inválida");
                    } else {
                        principalPessoa.execCadastro(nome, cpf, dataNasc); // Chamando o método com a instância de PrincipalPessoa
                    }
                    break; // Adicionado para sair do switch após o caso 1
                }
                case 2: {
                    principalPessoa.execIpressao();
                    break;
                }
            }
            if(input == 0) {
                System.out.println("Saindo do programa");
                break;
            }
        }
    }

    public void execCadastro(String nome, String cpf, String data) {
        pessoa = new Pessoa(cpf, nome, data);
        System.out.println("Cadastro efetuado");
    }

    public void execIpressao() {
        if(pessoa != null) {
            System.out.println("Seus dados são: ");
            System.out.println("O nome do usuário é: " + pessoa.getNome() + ", seu CPF é: " + pessoa.getCpf() + ", nasceu na data: " + pessoa.getDataNasc());
        } else {
            System.out.println("Nenhuma pessoa encontrada");
        }
    }
}
