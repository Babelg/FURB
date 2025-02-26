import java.util.Scanner;



public class calcularcomprimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("digite a largura");
      int largura = scanner.nextInt();


      System.out.println("digite a comprimento");
      int comprimento = scanner.nextInt();
       
      int soma = largura * comprimento;
      System.out.println("a area é: " +soma);
    }

}
