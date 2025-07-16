package NinvelIntermediario.Abstracao;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 17, "Aldeia da folha");
        Naruto.habilidade();
        Naruto.apresentar();
        Naruto.habilidadeUnica(Naruto.skill);


        Uchiha Sasuke = new Uchiha("Sasuke", 18, "Aldeia da folha");
        Sasuke.habilidade();
        Sasuke.apresentar();
        Sasuke.habilidadeUnica(Sasuke.skill);

    }
}