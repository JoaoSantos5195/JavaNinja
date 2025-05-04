package NivelIniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        while(min < max){
            min++;
            System.out.println("Naruto criou " + min + " clones da sombra");
        }
        System.out.println("=======================");
        System.out.println("=======================");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Naruto criou " + i + " clones da sombra");
        }
    }
}
