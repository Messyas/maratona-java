package exercicios.ListaDePOO.Exercicio14;

import exercicios.ListaDePOO.Exercicio13.ContaCorrente;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class PrincipalContaCorrente {
    private static final int TAM = 3;
    private static ContaCorrente[] cc = new ContaCorrente[TAM];
    public static int indice = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Consultar");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    execCadastrar(scanner);
                    break;
                case 2:
                    execSaque(scanner);
                    break;
                case 3:
                    execDeposito(scanner);
                    break;
                case 4:
                    execConsulta(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void execCadastrar(Scanner scanner) {
        if (indice < TAM) {
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.next();
            System.out.println("Digite o número da conta:");
            String conta = scanner.next();
            System.out.println("Digite o número da agência:");
            String agencia = scanner.next();

            cc[indice] = new ContaCorrente(nomeCliente, conta, agencia);
            System.out.println("Conta cadastrada com sucesso!");
            indice++;
        } else {
            System.out.println("Limite de contas atingido!");
            indice = 0; // Reinicializa o índice
        }
    }

    public static void execSaque(Scanner scanner) {
        if (indice > 0) {
            System.out.println("Escolha a posição da conta:");
            int posicao = scanner.nextInt();
            System.out.println("Digite o valor do saque:");
            double valor = scanner.nextDouble();

            if (posicao >= 0 && posicao < indice) {
                double resultado = cc[posicao].sacar(valor);
                if (resultado > 0)
                    System.out.println("Saque realizado com sucesso!");
                else
                    System.out.println("Saque não realizado.");
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("Nenhuma conta cadastrada!");
        }
    }

    public static void execDeposito(Scanner scanner) {
        if (indice > 0) {
            System.out.println("Escolha a posição da conta:");
            int posicao = scanner.nextInt();
            System.out.println("Digite o valor do depósito:");
            double valor = scanner.nextDouble();

            if (posicao >= 0 && posicao < indice) {
                cc[posicao].depositar(valor);
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("Nenhuma conta cadastrada!");
        }
    }

    public static void execConsulta(Scanner scanner) {
        if (indice > 0) {
            System.out.println("Escolha a posição da conta:");
            int posicao = scanner.nextInt();

            if (posicao >= 0 && posicao < indice) {
                cc[posicao].imprimir();
            } else {
                System.out.println("Posição inválida!");
            }
        } else {
            System.out.println("Nenhuma conta cadastrada!");
        }
    }
}
