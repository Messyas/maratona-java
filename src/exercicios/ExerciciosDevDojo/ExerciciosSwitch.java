package exercicios.ExerciciosDevDojo;

public class ExerciciosSwitch {
    public static void main(String[] args) {
        // dados ps valores de 1 a 7, imprima se é dia ou final de semana
        byte dia = 2;
        String diaSem = " ";
        //switch so pode ter char, int , byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                diaSem = "Final de semana";
                break;
            case 2:
                System.out.println("Segunda");
                diaSem = "Dia util";
                break;
            case 3:
                System.out.println("Terca");
                diaSem = "Dia util";
                break;
            case 4:
                System.out.println("quarta");
                diaSem = "Dia util";
                break;
            case 5:
                System.out.println("Quinta");
                diaSem = "Dia util";
                break;
            case 6:
                System.out.println("Sexta");
                diaSem = "Dia util";
                break;
            case 7:
                System.out.println("Sabado");
                diaSem = "Final de semana";
                break;
            default: //pra caso nenhuma opcao seja atendida
                System.out.println("se fudeu ksks");
                break;
        }

        System.out.println(diaSem);
    }
}
