import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        
        
        double valor = scanner.nextDouble();
        
        // Valor
        System.out.println("NOTAS E MOEDAS:");
        
        // Cédulas em valor normal
        int[] cedulas = {100, 50, 20, 10, 5, 2}; // Notas de 100, 50, 20, 10, 5, 2
        String[] cedulasString = {"100", "50", "20", "10", "5", "2"};
        
        // Cédulas
        for (int i = 0; i < cedulas.length; i++) {
            int quantidade = (int) (valor / cedulas[i]); 
            valor -= quantidade * cedulas[i]; 
            System.out.println(quantidade + " nota(s) de R$ " + cedulasString[i] + ",00");
        }
        
        // Moedas em valor normal
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01}; // Moedas de 1, 0.50, 0.25, 0.10, 0.05, 0.01
        String[] moedasString = {"1", "0.50", "0.25", "0.10", "0.05", "0.01"};
        
        // Moedas
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = (int) (valor / moedas[i]); 
            valor -= quantidade * moedas[i]; 
            System.out.println(quantidade + " moeda(s) de R$ " + moedasString[i]);
        }
        
        // Scanner
        scanner.close();
    }
}
