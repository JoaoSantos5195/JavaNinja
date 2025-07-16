package NinvelIntermediario.ClassesMultiplas;

public class Uchiha extends Ninja implements SharinganInterface {
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }
    public Uchiha(String nome, int idade, String habilidade) {
        super(nome, habilidade, idade);
    }
}
