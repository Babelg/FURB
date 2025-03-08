import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dados funcionario
        String nome = scanner.nextLine();
        int horasTrabalhadas = scanner.nextInt();
        int dependentes = scanner.nextInt();
        
        // Valor de pagamento
        double valorHora = 10.00;     
        double valorDependente = 60.00;  
        
        // Salário trabalho e salário família
        double salarioTrabalho = horasTrabalhadas * valorHora;
        double salarioFamilia = dependentes * valorDependente;
        
        // INSS e Imposto de Renda
        double descontoINSS = salarioTrabalho * 0.085;
        double descontoIR = salarioTrabalho * 0.05;
        
        // salário bruto e o salário líquido
        double salarioBruto = salarioTrabalho + salarioFamilia;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        
        // Resultados
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
        
        scanner.close();
    }
}
