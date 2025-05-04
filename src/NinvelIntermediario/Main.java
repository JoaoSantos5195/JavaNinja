package NinvelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";
        naruto.rasengan();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.sharingan();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia = "Aldeia da folha";
        sakura.ultraCura();

        Hyuuga hinata = new Hyuuga();
        hinata.aldeia = "Aldeia da folha";
        hinata.nome = "Hinata Hyuuga";
        hinata.idade = 16;
        hinata.ataquesHyuuga();

    }
}
