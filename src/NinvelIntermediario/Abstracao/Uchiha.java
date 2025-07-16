package NinvelIntermediario.Abstracao;

public class Uchiha extends Ninja {

    String skill = "Sharingan";

    public Uchiha(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public void habilidade() {
        System.out.println("Ataco com Chidori");
    }

}
