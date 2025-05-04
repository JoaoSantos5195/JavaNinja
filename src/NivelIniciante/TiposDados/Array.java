package NivelIniciante.TiposDados;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sakura Haruno";
        ninjas[2] = "Sasuke Uchiha";
        ninjas[3] = "Kakashi Hatake";

        int[] idadeNinjas = new int[4];
        idadeNinjas[0] = 16;
        idadeNinjas[1] = 15;
        idadeNinjas[2] = 17;
        idadeNinjas[3] = 25;

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }
    }
}
