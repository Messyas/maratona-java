package exercicios.ListaDePOO.Exercicio17;


import java.util.Scanner;
import java.util.Vector;

public class ExemploExercicioVectorGenericos {
    private final Vector<ExemploExercicioDadosPessoais> dados = new Vector<>();
    private final Vector<ExemploExercicioDadosPessoais> dadosGenericos = new Vector<>();
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExemploExercicioVectorGenericos exemplo = new ExemploExercicioVectorGenericos();
        exemplo.menu();
    }

    public void menu(){
        int input;

        do{
            System.out.println("------------------------------------");
            System.out.println("--------| Seja bem vindo |----------");
            System.out.println("------------------------------------");
            System.out.println("Digite [1] para cadastrar");
            System.out.println("Digite [2] para listar os dados do atributo do tipo vector");
            System.out.println("Digite [3] para listar os dados do atributo do tipo vector especial para o tipo generico da classe ExemploExercicioDadosPessoais");
            System.out.println("Digite [4] para sair");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    listarFormatoGenerico();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (input != 4);
    }

    public void cadastrar() {
        ExemploExercicioDadosPessoais novo = new ExemploExercicioDadosPessoais();
        System.out.println("--------------------------------");
        System.out.println("Digite seus dados para cadastrar");
        System.out.println("--------------------------------");
        System.out.println("Digite o seu nome:");
        novo.setNome(scanner.next());

        System.out.println("Digite o seu telefone:");
        novo.setTelefone(scanner.next());

        System.out.println("Digite a sua idade:");
        novo.setIdade(scanner.nextInt());

        dados.add(novo);
        dadosGenericos.add(novo);
    }

    public void listar() {
        System.out.println("Dados cadastrados: ");
        for(ExemploExercicioDadosPessoais dado: dados) {
            System.out.println("Nome: " + dado.getNome() + ", Telefone: " + dado.getTelefone() + ", Idade: " + dado.getIdade());
        }
    }

    public void listarFormatoGenerico() {
        System.out.println("Dados cadastrados (formato generico):");
        for(ExemploExercicioDadosPessoais pessoa : dadosGenericos) {
            System.out.println("Nome: " + pessoa.getNome() + ", Telefone: " + pessoa.getTelefone() + ", Idade: " + pessoa.getIdade());
        }
    }
}

