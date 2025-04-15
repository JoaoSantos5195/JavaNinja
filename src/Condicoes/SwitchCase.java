package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resp;
        do {
            System.out.println("ESCOLHA UM NINJA");
            System.out.println("Hashirama [1]");
            System.out.println("Tobirama [2]");
            System.out.println("Sarutobi [3]");

            short escolha = scanner.nextShort();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Escolheste Hashirama");
                    break;
                case 2:
                    System.out.println("Escolheste Tobirama");
                    break;
                case 3:
                    System.out.println("Escolheste Sarutobi");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Tem certeza? ");
            resp = scanner.nextLine().trim().toLowerCase();
        } while (resp.equals("nao"));

        scanner.close();
    }
}
