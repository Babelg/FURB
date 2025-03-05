import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Informe o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Informe o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Informe o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        //Cálculo
        double salario = horasTrabalhadas * valorHora;

        //Saída
        DecimalFormat df = new DecimalFormat("0.00");

        //Resultado
        System.out.println("Número do Funcionário: " + numeroFuncionario);
        System.out.println("O salário é de: R$ " + df.format(salario));

        //Scanner
        scanner.close();
    }
}
