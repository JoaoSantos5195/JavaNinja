package SistemaBanco;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

   public static void main(String[] args) {
    int numAnterior = 0;  // Inicialize com o valor desejado
    Usuario.criaId(numAnterior);
    ArrayList<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario(1, "João", "1234", 12332145609, 100, 15000, 2300, 0));
 

    do{
        System.out.println("O que queres? ");
        System.out.println("1- logar'");
        System.out.println("2 - sair");
        System.out.println("3 - registrar");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
   }


}
