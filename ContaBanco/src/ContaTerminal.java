import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o numero da conta !");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite a agência !");
        String agencia = scanner.next();

        scanner.nextLine();
        
        System.out.print("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();
    

        System.out.print("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque.");
    }
}

