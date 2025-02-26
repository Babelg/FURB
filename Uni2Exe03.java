import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        
        double pi = 3.14159;
        
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        
        double area = pi * Math.pow(raio, 2);
        
        
        System.out.printf("A área do círculo é: %.4f\n", area);
        
       scanner.close();
    
    }
}
