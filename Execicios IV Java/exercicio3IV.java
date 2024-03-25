
    import java.util.Scanner;

    public class exercicio3IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

       
        do {
            System.out.print("Digite seu nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

    
        do {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

    
        do {
            System.out.print("Digite seu salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

 
        do {
            System.out.print("Digite seu sexo ('f' ou 'm'): ");
            sexo = scanner.next().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Digite seu estado civil ('s', 'c', 'v' ou 'd'): ");
            estadoCivil = scanner.next().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
}
}
