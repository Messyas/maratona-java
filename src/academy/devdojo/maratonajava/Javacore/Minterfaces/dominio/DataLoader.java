package academy.devdojo.maratonajava.Javacore.Minterfaces.dominio;

import java.security.PublicKey;

/**
 * Interfaces sao contratos
 * Para uma classe implementar um contrato de uma interface, deve-se usar a palabra reservada 'Implements'
 * notas: em interfaces no java, todos os metodos sao public e abstract
 */
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;//PARA A JRM ISSO É REDUNDANTE POIS TODA VARIAVEL DENTRO DE UMA INTERFACE É FINAL POR PADRAO
    void laod();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    } //nao é necessario implementar

    public static void retriveMaxDataSiza() {
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }// nao pode ser sobrescrito

}
