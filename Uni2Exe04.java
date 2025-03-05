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
        double pesoA = 3.5;
        double pesoB = 7.5;

        // Média
        double mediaPonderada = ((notaA * pesoA) + (notaB * pesoB)) / (pesoA + pesoB);

        // Resultado
        System.out.printf("A média ponderada é: %.5f%n", mediaPonderada);

        // Scanner
        scanner.close();
    }
}
