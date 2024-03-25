import java.util.Scanner;

public class exercicio1IV{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
        System.out.println("Digite um número entre zero e dez: ");
        nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println ("Valor INVÁLIDO. A nota deverá ser entre 0 e dez.");
        }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);


        scanner.close();

    }
    
}



