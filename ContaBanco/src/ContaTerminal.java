import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        Conta conta1 = new Conta();

        System.out.println("Digite o número da conta: ");
        conta1.numeroConta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o número da agência: ");
        conta1.agenciaConta = entrada.nextLine();

        System.out.println("Digite o seu nome: ");
        conta1.nomeClienteConta = entrada.nextLine();

        System.out.println("Digite o saldo da conta: ");
        conta1.saldoConta = entrada.nextDouble();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                conta1.nomeClienteConta, conta1.agenciaConta, conta1.numeroConta, conta1.saldoConta));

        entrada.close();
    }
}

class Conta {
    int numeroConta;
    String agenciaConta;
    String nomeClienteConta;
    double saldoConta;
}
