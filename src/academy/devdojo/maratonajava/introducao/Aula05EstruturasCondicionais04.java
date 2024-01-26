package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo
        byte dia = 8;
        //switch so pode ter char, int , byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: //pra caso nenhuma opcao seja atendida
                System.out.println("se fudeu ksks");
                break;

        }

        char sexo = 'M';
        switch (sexo) {
            case 'M': { //pode por bloco de codigo {} mas nao é recomendado ou de uso comum
                System.out.println("Homem");
                break;
            }
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Sexo Invalido");
                break;
        }

    }
}
