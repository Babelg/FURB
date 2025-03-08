import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Quantidade
        int latas = scanner.nextInt();
        int garrafas600ml = scanner.nextInt();
        int garrafas2L = scanner.nextInt();
        
        // Litros
        double totalLitros = (latas * 350.0 / 1000) + (garrafas600ml * 600.0 / 1000) + (garrafas2L * 2);
        
        // Total
        System.out.println(totalLitros);
        
        scanner.close();
    }
}
