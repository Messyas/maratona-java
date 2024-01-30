package academy.devdojo.maratonajava.Javacore.fmodificadorstatic.test;


import academy.devdojo.maratonajava.Javacore.fmodificadorstatic.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("bmw",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

       Carro.velocidadeLimite = 180;//usando o modificador de acesso static, agora todos os objetos vao ter o valor de veloxidade limite alterado para 180

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
