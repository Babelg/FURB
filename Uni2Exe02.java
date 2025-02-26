import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

    
        double resultado = num1 * num2;

        
        System.out.println("O resultado da multiplicação é: " + resultado);

       
        scanner.close();
    }
}
