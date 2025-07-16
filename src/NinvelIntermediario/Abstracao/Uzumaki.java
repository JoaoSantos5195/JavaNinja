package NinvelIntermediario.Abstracao;

public class Uzumaki extends Ninja {

    String skill = "Rasengan";

    public Uzumaki(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public void habilidade() {
        System.out.println("Ataco com Rasengan");
    }

}
