package NinvelIntermediario.Desafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Ninja> ninjas = new HashMap<>();


        int escolha;


        do {
        System.out.println("--- CRIAÇÃO DE NINJA ---");
        System.out.println("1 - Criar Uzumaki ");
        System.out.println("2 - Criar Uchiha");
        System.out.println("3 - Sair");
        escolha = sc.nextInt();
        sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("qual o nome? ");
                    String nomeNinja = sc.nextLine(); // OK

                    System.out.println("qual a idade? ");
                    short idadeNinja = sc.nextShort();
                    sc.nextLine(); // limpa ENTER do nextShort

                    System.out.println("qual a missao? ");
                    String missaoNinja = sc.nextLine(); // OK

                    System.out.println("nível de dificuldade da missão? ");
                    char nivelNinja = sc.next().charAt(0);
                    sc.nextLine(); // limpa ENTER do next()

                    System.out.println("qual o status? ");
                    String statusNinja = sc.nextLine(); // OK


                    Uzumaki ninja = new Uzumaki();
                    ninja.nome = nomeNinja;
                    ninja.idade = idadeNinja;
                    ninja.missao = missaoNinja;
                    ninja.nivelMissao = nivelNinja;
                    ninja.statusMissao = statusNinja;

                    ninja.rasengan();
                    ninja.mostrarInfo();

                    break;
                case 2:
                    System.out.println("qual o nome? ");
                    nomeNinja = sc.nextLine();

                    System.out.println("qual a idade? ");
                    idadeNinja = sc.nextShort();
                    sc.nextLine(); // limpa ENTER do nextShort

                    System.out.println("qual a missao? ");
                    missaoNinja = sc.nextLine();

                    System.out.println("nível de dificuldade da missão? ");
                    nivelNinja = sc.next().charAt(0);
                    sc.nextLine(); // limpa ENTER do next()

                    System.out.println("qual o status? ");
                    statusNinja = sc.nextLine();

                    Uchiha ninja2 = new Uchiha();
                    ninja2.nome = nomeNinja;
                    ninja2.idade = idadeNinja;
                    ninja2.missao = missaoNinja;
                    ninja2.nivelMissao = nivelNinja;
                    ninja2.statusMissao = statusNinja;

                    ninja2.sharingan();
                    ninja2.mostrarInfo();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida");
            }
        }while(escolha != 3);
    }
}
