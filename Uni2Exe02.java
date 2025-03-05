import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Cálculo
        double resultado = num1 * num2;

        // Resultado
        System.out.printf("O resultado da multiplicação é: %.2f%n", resultado);

        // Scanner
        scanner.close();
    }
}
