package NivelIniciante.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        /*Variável = (condição) ? valorSeVerdadeiro : valorSeFalso*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas missões você completou? ");
        short missoes = scanner.nextShort();
        scanner.close();

        String resultado = (missoes >= 12) ? "Você é avançado" : "Você está no caminho certo";
        System.out.println(resultado);
    }
}
