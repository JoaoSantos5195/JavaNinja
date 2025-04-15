package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*Objetivo - Passar o nível de ninja de acordo com número de missões*/

        String nomeNinja = "Naruto Uzumaki";
        short idade = 21;
        boolean hokage = false;
        short missoes = 34;

        if (missoes > 20 && idade >= 20){
            hokage = true;
            System.out.println("Naruto é um HOKAGE");
        }else if(missoes <20 && missoes > 14 || idade >17){
            System.out.println("Naruto é um jounin");
        }else if (missoes <= 10 || idade < 14){
            System.out.println("Naruto é genim");
        }else{
            System.out.println("Naruto é chunim");
        }
    }
}
