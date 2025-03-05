import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        // Cálculo
        double area = Math.PI * Math.pow(raio, 2);
        
        // Resultado
        System.out.printf("A área do círculo é: %.4f%n", area);

        //Scanner
        scanner.close();
    }
}
