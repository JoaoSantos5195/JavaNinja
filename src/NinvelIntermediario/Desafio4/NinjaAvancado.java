package NinvelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome,especialidade;
    TipoHabilidade habilidade;
    short idade;

    @Override
    public void mostrarInformacoes(){
        System.out.println("Meu nomé é " + nome + " eu tenho "+ idade + " anos.");
    }

    @Override
    public void executarHabilidade(){
        System.out.println("A minha habilidade especial é " + habilidade);
        System.out.println(habilidade + "!!!!!!!!!!");
    }
    public NinjaAvancado (String nome, TipoHabilidade habilidade, short idade, String especialidade){
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.especialidade = especialidade;
    }
    public void mostrarEspecialidade(){
        System.out.println("Eu sou especilista em "+ especialidade );
    }
}
