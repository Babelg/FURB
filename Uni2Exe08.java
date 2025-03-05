import java.util.Scanner;

public class CalculadoraPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeira peça
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidadePeca1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();

        // Segunda peça
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidadePeca2 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();

        // Cálculo
        double totalPagar = (quantidadePeca1 * valorUnitarioPeca1) + (quantidadePeca2 * valorUnitarioPeca2);

        // Resultado
        System.out.printf("O valor total a pagar é: R$ %.2f%n", totalPagar);

        // Scanner
        scanner.close();
    }
}
