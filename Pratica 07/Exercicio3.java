import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Vetor de números reais:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
