package Desafio1;

public class Principal extends Ninjas {
    public static void main(String[] args) {

        Ninjas naruto = new Ninjas();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.missao = "Se tornar hokage";
        naruto.dificuldadeMissao = "S";
        naruto.status = "Em andamento";
        naruto.resultadoMissao();

        Ninjas sasuke = new Ninjas();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 16;
        sasuke.missao = "Matar Itachi";
        sasuke.dificuldadeMissao = "S";
        sasuke.status = "Ganhando poder";
        sasuke.resultadoMissao();

        Ninjas sakura = new Ninjas();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;
        sakura.missao = "Achar o Sasuke";
        sakura.dificuldadeMissao = "B";
        sakura.status = "Em andamento";
        sakura.resultadoMissao();

    }
}
