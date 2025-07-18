package NinvelIntermediario.Abstracao;

public abstract class Ninja implements HabilidadesUnicas {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //metodo concreto
    public void apresentar(){
        System.out.println("Ninja "+nome+" "+idade+" anos");
    }
    //metodo abstrato - Obrigatoriamente deve ser instaciado
    public abstract void habilidade();

    @Override
    public void habilidadeUnica(String skill){
        System.out.println("Minha habilidade unica é "+ skill);
    }
}
