package exercicios.ListaDePOO.Exercicio05;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Computador {
    private String marca;
    private String cor;
    private String modelo;
    private int numeroDeSerie;
    private double preco;

    public Computador(String marca, String cor, String modelo, int numeroDeSerie, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numero de serie: " + this.numeroDeSerie);
        System.out.println("Preco: " + this.preco);
    }

    public void calcularValor() {
        if(marca.equals("HP")){
            this.preco+=(this.preco*0.30);
        } else if (marca.equals("IBM")) {
            this.preco+=(this.preco*0.50);
        }
    }

    public int alterarValor(double valor) {
        if(valor>0){
            System.out.println("Novo valor atribuido ao preco");
            this.preco = valor;
            return 1;
        }
        else {
            System.out.println("Nenhum valor atribuido ao preco");
        }
        return 0;
    }


}
