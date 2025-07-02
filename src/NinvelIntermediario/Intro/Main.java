package NinvelIntermediario.Intro;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        Uchiha sasuke = new Uchiha();
        Haruno sakura = new Haruno();
        Hyuuga hinata = new Hyuuga();
        Boruto boruto = new Boruto();

        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";
        naruto.rasengan();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.sharingan();

        sakura.nome = "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia = "Aldeia da folha";
        sakura.ultraCura();

        hinata.aldeia = "Aldeia da folha";
        hinata.nome = "Hinata Hyuuga";
        hinata.idade = 16;
        hinata.ataquesHyuuga();

        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da folha";
        boruto.idade = 13;
        boruto.AtivarJougan();
        boruto.AtivarKarma();
        boruto.rasengan();
    }
}
