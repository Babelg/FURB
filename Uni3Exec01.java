import java.util.Scanner;

public class Uni03Exe01 {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int largura = scanner.nextInt();
            int comprimento = scanner.nextInt();
            
            int area = largura * comprimento;
            
            System.out.println("A area e de:" + area);
        }   
    }
}
