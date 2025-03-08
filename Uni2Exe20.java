import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dobras
        int dobras = scanner.nextInt();
        
        // Calculo
        int quadrados = (int) Math.pow(2, dobras); 
        quadrados = quadrados * quadrados; // Total de quadrados visíveis
        
        // Resultado
        System.out.println(quadrados);
        
        scanner.close();
    }
}
