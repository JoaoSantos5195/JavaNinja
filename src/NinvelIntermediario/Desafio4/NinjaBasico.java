package NinvelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    TipoHabilidade habilidade;
    short idade;

    public NinjaBasico (String nome, TipoHabilidade habilidade, short idade){
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Meu nomé é " + nome + " eu tenho "+ idade + " anos.");
    }
    @Override
    public void executarHabilidade(){
        System.out.println("A minha habilidade especial é " + habilidade);
        System.out.println(habilidade + "!!!!!!!!!!");
    }


}
