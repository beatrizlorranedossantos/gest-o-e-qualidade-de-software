import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inteiros = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            inteiros[i] = scanner.nextInt();
            if (inteiros[i] % 2 == 0) {
                somaPares += inteiros[i];
            }
        }

        System.out.println("Vetor de números inteiros:");
        for (int num : inteiros) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);

        scanner.close();
    }
}
