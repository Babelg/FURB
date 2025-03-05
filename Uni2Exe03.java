import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Raio
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        // Área
        double area = Math.PI * Math.pow(raio, 2);
        
        // Resultado
        System.out.printf("A área do círculo é: %.4f%n", area);

        // Scanner
        scanner.close();
    }
}
