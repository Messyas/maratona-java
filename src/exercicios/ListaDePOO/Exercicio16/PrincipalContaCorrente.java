package exercicios.ListaDePOO.Exercicio16;

import java.util.Scanner;

public class PrincipalContaCorrente {

    public ContaCorrente contaCorrente;

    public static void main(String[] args) {
        PrincipalContaCorrente principalContaCorrente = new PrincipalContaCorrente();
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (input != 5){

            System.out.println("Digite [1] para depositar");
            System.out.println("Digite [2] para sacar");
            System.out.println("Digite [3] para imprime");
            System.out.println("Digite [4] para cadastrar");
            System.out.println("Digite [5] para sair");
            input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Digite o valor do deposito");
                    double valor = scanner.nextDouble();
                    principalContaCorrente.depositar(valor);
                    break;

                }

                case 2: {
                    System.out.println("Digite o valor para sacar");
                    double valor = scanner.nextDouble();
                    principalContaCorrente.sacar(valor);
                    break;

                }

                case 3: {
                    principalContaCorrente.imprime();
                    break;
                }

                case 4: {
                    //bug na hora de pedir pra digitar
                    System.out.println("Digite seus dados para cadastrar\n");

                    System.out.println("Digite o seu nome: ");
                    String nomeCad = scanner.toString();

                    System.out.println("Digite a agencia");
                    String agenciaCad = scanner.toString();

                    System.out.println("Digite a agencia");
                    String contaCad = scanner.toString();

                    principalContaCorrente.cadastrar(nomeCad,agenciaCad,contaCad);

                    break;
                }

                case 5: {
                    System.out.println("Saindo");
                    break;
                } default:
                    System.out.println("Digite um numero valido");
            }
        }

    }

    public void imprime() {
        if(this.contaCorrente != null) {
            System.out.println("Nome: " + contaCorrente.getNomeCliente());
            System.out.println("agencia: " + contaCorrente.getAgencia());
            System.out.println("conta: " + contaCorrente.getConta());
            System.out.println("saldo: " + contaCorrente.getSaldo());
        } else {
            System.out.println("Crie uma conta primeiro");
        }
    }

    public void cadastrar(String nome, String agencia, String conta) {
        if(this.contaCorrente == null) {
            contaCorrente = new ContaCorrente(nome, agencia, conta);
        } else {
            System.out.println("Conta ja cadastrada");
        }
    }

    public void depositar(double valor) {
        if(this.contaCorrente != null){
            contaCorrente.depositar(valor);
        } else {
            System.out.println("Crie uma conta para poder depositar");
        }
    }

    public void sacar(double valor) {
        int result;
        if(this.contaCorrente != null){
             result = contaCorrente.sacar(valor);
             if(result == 1) {
                 System.out.println("Saque efetuado");
             } else {
                 System.out.println("algo deu errado");
             }
        } else {
            System.out.println("Crie uma conta para poder sacar");
        }
    }


}

