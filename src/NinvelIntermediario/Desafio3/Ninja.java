package NinvelIntermediario.Desafio3;

import java.sql.SQLOutput;

public class Ninja {
    String nome;
    short idade;
    String missao;
    char nivelMissao;
    String statusMissao;

    public void mostrarInfo(){
        System.out.println("--------------------------------------");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível da missão: " + nivelMissao);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("-------------------------------------");
    }

}
