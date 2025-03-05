import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada 
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mês: ");
        double totalVendas = scanner.nextDouble();

        // Cálculo dos 15%
        double comissao = totalVendas * 0.15;

        // Cálculo
        double totalReceber = salarioFixo + comissao;

        //Resultado
        System.out.printf("O vendedor %s receberá um total de R$ %.2f neste mês.%n", nomeVendedor, totalReceber);

        // Scanner
        scanner.close();
    }
}
