import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mensagem
        System.out.println("Digite os valores de x1, y1, x2 e y2 para calcular a distância entre os pontos:");
        
        // Valores
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Scanner
        scanner.close();
        
        // Cálculo
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        //Resultado
        System.out.printf("DISTANCIA: %.4f\n", distancia);
    }
}
