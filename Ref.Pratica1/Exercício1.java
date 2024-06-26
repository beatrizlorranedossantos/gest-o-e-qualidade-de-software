import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Informe os coeficientes a, b e c:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            resolverEquacao(a, b, c);

            System.out.println("Deseja resolver outra equação? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
            }
        }

        scanner.close();
    }

    public static void resolverEquacao(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
        } else {
            System.out.println("Esta é uma equação de segundo grau");
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Esta equação possui duas raízes reais diferentes: delta = %.2f, x' = %.2f, x'' = %.2f%n", delta, raiz1, raiz2);
            }
        }
    }
}
