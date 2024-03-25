import java.util.Scanner;

public class exercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar o maior número
        int maior = Integer.MIN_VALUE;

        // Loop para ler os 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verifica se o número é maior que o armazenado atualmente
            if (numero > maior) {
                maior = numero;
            }
        }

        // Exibe o maior número
        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}