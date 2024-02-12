package academy.devdojo.maratonajava.Javacore.AintrudocaoClasses.test;

import academy.devdojo.maratonajava.Javacore.AintrudocaoClasses.model.Pessoa;

/**
 * acoplamento, se refere ao quanto uma classe depende de outra.
 */
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Messyas");
        pessoa.setIdade(20);
        pessoa.implime();

        System.out.println(pessoa.getNome() + " " + " " + pessoa.getIdade());

    }
}
