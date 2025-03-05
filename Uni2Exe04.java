import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a nota A (peso 3.5): ");
        double notaA = scanner.nextDouble();

        System.out.print("Digite a nota B (peso 7.5): ");
        double notaB = scanner.nextDouble();

        // Pesos
        final double PESO_A = 3.5;
        final double PESO_B = 7.5;

        // Média
        double mediaPonderada = ((notaA * PESO_A) + (notaB * PESO_B)) / (PESO_A + PESO_B);

        // Resultado
        System.out.printf("A média ponderada é: %.5f%n", mediaPonderada);

        // Scanner
        scanner.close();
    }
}
