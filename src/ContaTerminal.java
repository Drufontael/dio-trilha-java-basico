import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numero=entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite a agência: ");
        String agencia= entrada.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente=entrada.nextLine();
        System.out.print("Digite o saldo: ");
        double saldo= entrada.nextDouble();
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo de " +
                "R$ %.2f já esta disponível para saque",nomeCliente,agencia,numero,saldo);
        entrada.close();
    }
}
