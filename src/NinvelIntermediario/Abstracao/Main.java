package NinvelIntermediario.Abstracao;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.habilidade();
        Naruto.apresentar();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.habilidade();
        Sasuke.apresentar();
        Sasuke.habilidadeUnica(Sasuke.skill);

    }
}