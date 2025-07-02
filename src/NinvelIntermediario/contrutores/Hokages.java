package NinvelIntermediario.contrutores;

public class Hokages {
    String nome;
    short idade;
    boolean vivoOuMorto;

    //NoArgsConstructor
    public Hokages(){
    }
    //AllArgsConstructor
    public Hokages(String nome, short idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }
    public void exibirInfo(){
        System.out.println("Meu nome é "+nome+" tenho "+idade+" anos");
    }
}
