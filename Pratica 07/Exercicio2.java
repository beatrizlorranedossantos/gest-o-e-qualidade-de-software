import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] reais = new double[10];

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            reais[i] = scanner.nextDouble();
        }

        System.out.println("Vetor de números reais:");
        for (int i = 0; i < reais.length; i++) {
            System.out.print(reais[i] + " ");
            if (reais[i] < 0) {
                System.out.println("(Posição " + i + ")");
            }
        }

        scanner.close();
    }
}
