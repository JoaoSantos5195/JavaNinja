package NivelIniciante.Desafio2;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int qntNinja = 0;
        String[] ninjas = new String[qntNinja];
        int escolha;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Quantos ninjas quer add? ");
                    qntNinja = scanner.nextInt();
                    if (qntNinja<1){
                        System.out.println("Opção inválida");
                        System.exit(0);
                    }else {
                        ninjas = new String[qntNinja];
                        scanner.nextLine(); // Corrige o problema do nextLine após nextInt

                        for (i = 0; i < qntNinja; i++) {
                            System.out.println("Add o " + i + " ninja");
                            ninjas[i] = scanner.nextLine();
                        }
                    }
                    break;
                case 2:
                    if (qntNinja == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else {
                        System.out.println("Ninjas add: ");
                        for (int j = 0; j < ninjas.length; j++) {
                            System.out.println("- " + ninjas[j]);
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválda");
            }
        } while (escolha != 3);


        scanner.close();
    }
}
