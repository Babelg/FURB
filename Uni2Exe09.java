import java.util.Scanner;

public class CambioDolarParaReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor em dólares a ser trocado: ");
        double valorDolares = scanner.nextDouble();

        System.out.print("Digite a cotação atual do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        // Cálculo
        double valorReais = valorDolares * cotacaoDolar;

        // Resultado
        System.out.printf("O atendente deve devolver R$ %.2f%n", valorReais);

        // Scanner
        scanner.close();
    }
}
