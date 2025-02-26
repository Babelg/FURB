
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Informe o número do funcionário:");
        int nfunc= scanner.nextInt();

        System.out.println("Informe o número das horas trabalhadas:");
        int nhoras= scanner.nextInt();

        System.out.println("Informe o valor do salário:");
        int nsalario= scanner.nextInt();
        
        int soma = nhoras * nsalario; 
        System.out.println("O valor do salário é de: " + soma);
       
        DecimalFormat df = new DecimalFormat("0.00");
        

    }
}
