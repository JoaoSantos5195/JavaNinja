package Condicoes;

import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {

        Scanner caixaTexto = new Scanner(System.in);
            System.out.println("Escreva o nome do ninja: ");
            String nomeNinja = caixaTexto.nextLine();
            System.out.println("Escreva a idade do seu ninja ");
            short idadeNinja = caixaTexto.nextShort();
        System.out.println("O nome é " + nomeNinja + " a idade é " + idadeNinja);
        caixaTexto.close();
    }
}
