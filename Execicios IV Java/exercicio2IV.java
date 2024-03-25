import java.util.Scanner;

public class exercicio2IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.print("Digite seu nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Cadastro concluído com sucesso!");
        
        scanner.close();
    }
}
