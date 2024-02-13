package exercicios.ListaDePOO.Exercicio04;

import exercicios.ListaDePOO.Exercicio03.Acampamento;

public class PrincipalAcampamento {
    public static void main(String[] args) {
        Acampamento acampamento = new Acampamento("Casa legal", 18);
        acampamento.imprime();
        acampamento.separarGrupo();
        acampamento.imprime();
    }
}
