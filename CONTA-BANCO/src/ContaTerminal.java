import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
    var scanner = new Scanner(System.in);
    float saldo = 237.48f;

    System.out.println("Por favor, digite o número da conta!");
    int nAccount = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência!");
    String nAgen = scanner.next();

    System.out.println("Por favor, informe seu nome!");
    String name = scanner.next();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", name, nAgen, nAccount, saldo);

    }
}