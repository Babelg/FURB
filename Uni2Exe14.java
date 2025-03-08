import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Valor int
        int valor = scanner.nextInt();
        
        // Cédulas 
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        
        // Valor
        System.out.println(valor);
        
        // Notas
        for (int cedula : cedulas) {
            int quantidade = valor / cedula;  // Quantidade de cédulas dessa denominação
            valor = valor % cedula;           // Atualiza o valor restante
            System.out.println(quantidade + " nota(s) de R$ " + cedula + ",00");
        }
        
        // Scanner
        scanner.close();
    }
}
