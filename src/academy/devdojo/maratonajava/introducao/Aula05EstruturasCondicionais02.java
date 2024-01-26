package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto
        int idade = 17;
        String categoria = "";
        if(idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else { //nao precisa de um else if (idade < 18) ja que o compilador entende que o evento so acontece se os outros nao acontecerem
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);

    }
}
