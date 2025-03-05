import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mensagem Distância
        System.out.println("Digite a distância (em Km) que o carro Y deve alcançar em relação ao carro X:");
        
        // Distância
        int distancia = scanner.nextInt();
        
        // Scanner
        scanner.close();
        
        // Cálculo
        int tempo = distancia * 2; // Cada km leva 2 minutos
        
        // Resultado
        System.out.printf("TEMPO: %d minutos\n", tempo);
    }
}
