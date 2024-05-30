import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nome = "MÁRIO ANDRADE";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = entrada.next();
        System.out.println("Informe o número da conta:");
        int numeroConta = entrada.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " +
        agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
