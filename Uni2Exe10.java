import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o tempo de duração do evento (em segundos): ");
        int tempoTotalSegundos = Math.max(scanner.nextInt(), 0); // Garante que o valor nunca seja negativo

        // Conversão
        int horas = tempoTotalSegundos / 3600;
        int minutos = (tempoTotalSegundos % 3600) / 60;
        int segundos = tempoTotalSegundos % 60;

        // Resultado
        System.out.printf("Tempo formatado (horas:minutos:segundos): %02d:%02d:%02d%n", horas, minutos, segundos);

        // Scanner
        scanner.close();
    }
}
