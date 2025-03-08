import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Valores
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        

        int A = B;
        
        // Resultado
        System.out.println("O valor de A é: " + A);
        
        scanner.close();
    }
}
