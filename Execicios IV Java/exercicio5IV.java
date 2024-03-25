import java.util.Scanner;

public class exercicio5IV {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            // Solicitar populações e taxas de crescimento
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;

            // Validação da população A
            do {
                System.out.print("Informe a população inicial do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("População inicial do país A deve ser maior que zero.");
                }
            } while (populacaoA <= 0);

            // Validação da taxa de crescimento A
            do {
                System.out.print("Informe a taxa de crescimento anual do país A (%): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("Taxa de crescimento anual do país A deve ser maior que zero.");
                }
            } while (taxaCrescimentoA <= 0);

            // Validação da população B
            do {
                System.out.print("Informe a população inicial do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("População inicial do país B deve ser maior que zero.");
                }
            } while (populacaoB <= 0);

            // Validação da taxa de crescimento B
            do {
                System.out.print("Informe a taxa de crescimento anual do país B (%): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("Taxa de crescimento anual do país B deve ser maior que zero.");
                }
            } while (taxaCrescimentoB <= 0);

            // Calcular número de anos necessários
            int anos = 0;
            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * (taxaCrescimentoA / 100);
                populacaoB += populacaoB * (taxaCrescimentoB / 100);
                anos++;
            }

            // Exibir resultado
            System.out.println("Número de anos necessários para a população do país A ultrapassar ou igualar a do país B: " + anos);

            // Perguntar ao usuário se deseja continuar
            System.out.print("Deseja realizar outra comparação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
