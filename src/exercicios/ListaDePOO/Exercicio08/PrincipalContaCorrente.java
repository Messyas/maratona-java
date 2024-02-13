package exercicios.ListaDePOO.Exercicio08;

import exercicios.ListaDePOO.Exercicio07.ContaCorrente;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrincipalContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente();
        int valor;
        while (true) {
            System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
            System.out.println(",,-------Seja bem vindo-------,,");
            System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

            System.out.println("\n");
            System.out.println("Digite [1] para cadastrar");
            System.out.println("Digite [2] para Depositar");
            System.out.println("Digite [3] para Sacar");
            System.out.println("Digite [4] para Consultar");
            System.out.println("Digite ( --0-- ) para sair");
            valor = scanner.nextInt();

            if(valor == 0) {
                System.out.println("fechando o programa");
                break;
            }

            if(valor == 1) {
                System.out.println("-------------------------\n");
                System.out.println("Vamos fazer seu cadastro\n");
                System.out.println("-------------------------");

                System.out.println("Digite o nome do cliente");
                String nomeCliente = scanner.next();

                System.out.println("Digite o número da conta:");
                String conta = scanner.next();

                System.out.println("Digite a agência:");
                String agencia = scanner.next();

                System.out.println("Digite o saldo:");
                double saldo = scanner.nextDouble();
                
               contaCorrente.setNomeCliente(nomeCliente);
               contaCorrente.setConta(conta);
               contaCorrente.setAgencia(agencia);
               contaCorrente.setSaldo(saldo);

            } else if (valor == 2) {
                System.out.println("Digite o valor do deposito ");
                double deposito = scanner.nextDouble();
                contaCorrente.depositar(deposito);
            } else if (valor == 3) {
                System.out.println("Digite o valor do saque ");
                double saque = scanner.nextDouble();
                double returno = contaCorrente.sacar(saque);
                if (returno == 1) {
                    System.out.println("Saque efetivado");
                } else if (returno == 0) {
                    System.out.println("Saldo insuficiente para o saque, digite um valor Compativel!");
                }
            } else if (valor == 4) {
                contaCorrente.imprimir();
            } else {
                System.out.println("Valor invalido");
            }
        }
    }
}
