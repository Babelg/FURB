import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Valores
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        // Scanner 
        scanner.close();
        
        // Definição do valor de PI
        final double PI = 3.14159;
        
        // Cálculo
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        
        // Resultados
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
