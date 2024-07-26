import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Recolhendo dados do usuário:
        System.out.println("Olá! Por favor, digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora por gentileza, digite seu saldo: ");
        double saldoConta = scanner.nextDouble();


        // imprimindo conta criada pelo usuário:
        System.out.println("Olá " + nome + "! Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + " e o número de sua conta é " + numeroConta + ".");
        System.out.println("Seu saldo é de " + saldoConta + ", e já está disponível para saque." );

        scanner.close();
    }
}
