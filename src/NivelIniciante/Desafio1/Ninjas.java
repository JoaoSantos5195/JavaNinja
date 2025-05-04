package NivelIniciante.Desafio1;

public class Ninjas {
        String nome;
        short idade;
        String missao;
        String dificuldadeMissao;
        String status;

        void resultadoMissao(){
                if (dificuldadeMissao.equals("S") || dificuldadeMissao.equals("A")){
                        System.out.println("Calma " + nome + " você deve treinar mais.");
                        status = "Em treinamento";
                }else{
                        System.out.println("Parabéns, " + nome + " você concluiu a missão");
                        status = "Missão finalizada";
                }
        }
        void mostrarNinja(){
                System.out.println("O ninja é "+ nome);
                System.out.println("Ele tem " + idade);
                System.out.println("Está fazendo a missão de: " + missao);
        }
}
