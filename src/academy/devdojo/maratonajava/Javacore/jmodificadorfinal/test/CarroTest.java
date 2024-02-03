package academy.devdojo.maratonajava.Javacore.jmodificadorfinal.test;

import academy.devdojo.maratonajava.Javacore.jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.Javacore.jmodificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
      //  Carro.VELOCIDADE_LIMITE = 180; nao e possivel mudar o valor de uma constante
        Comprador comprador = new Comprador();
      //  carro.COMPRADOR = new Comprador(); como o objeto é final nao pode ser instancido um novo objeto a partir do mesmo endereco

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);



    }
}
