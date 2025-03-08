import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Comprimento e altura
        double comprimento = scanner.nextDouble();
        double altura = scanner.nextDouble();
        
        // Azulejo
        double precoAzulejo = 12.50;
        
        // Calculo area
        double area = comprimento * altura;
        
        // Calculo numero de azulejos necessário
        int numeroAzulejos = (int) Math.ceil(area * 9);
        
        // Valor gasto
        double valorGasto = numeroAzulejos * precoAzulejo;
        
        // Resultado
        System.out.printf("Valor gasto com os azulejos: R$ %.2f\n", valorGasto);
        
        scanner.close();
    }
}
