import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        //PI
        double pi = 3.14159;
        
        // Scanner 
        Scanner scanner = new Scanner(System.in);

        // raio
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        //área
        double area = pi * Math.pow(raio, 2);
        
        //resultado
        System.out.printf("A área do círculo é: %.4f\n", area);
        
       
    }
}
