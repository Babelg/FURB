import java.util.Scanner;

public class MUni2Exe04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a nota A (peso 3.5): ");
        double A = scanner.nextDouble();

        System.out.print("Digite a nota B (peso 7.5): ");
        double B = scanner.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double mediaPonderada = ((A * pesoA) + (B * pesoB)) / (pesoA + pesoB);
        System.out.printf("A média ponderada é: %.5f\n", mediaPonderada);
        scanner.close();
    }
}
