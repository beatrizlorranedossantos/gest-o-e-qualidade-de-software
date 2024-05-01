import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        // Passo 1: Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Declarar um array para armazenar os 10 números inteiros
        int[] inteiros = new int[10];
        // Inicializar a variável para armazenar a soma dos números pares
        int somaPares = 0;

        // Passo 3: Solicitar ao usuário que insira 10 números inteiros
        System.out.println("Digite 10 números inteiros:");

        // Passo 4: Ler os números inteiros fornecidos pelo usuário e calcular a soma dos números pares
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            inteiros[i] = scanner.nextInt();
            // Verificar se o número é par e adicionar à somaPares se for
            if (inteiros[i] % 2 == 0) {
                somaPares += inteiros[i];
            }
        }

        // Passo 5: Exibir o vetor de números inteiros e a soma dos números pares
        System.out.println("Vetor de números inteiros:");
        for (int num : inteiros) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);

        // Passo 6: Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
