import java.util.Scanner;

public class EquacaoSegundoGrauRefatorada {

    private static final String MSG_IGUALDADE = "Igualdade confirmada: 0 = 0";
    private static final String MSG_COEF_INCORRETOS = "Coeficientes informados incorretamente";
    private static final String MSG_PRIMEIRO_GRAU = "Esta é uma equação de primeiro grau: x = ";
    private static final String MSG_SEGUNDO_GRAU = "Esta é uma equação de segundo grau";
    private static final String MSG_SEM_RAIZES_REAIS = "Esta equação não possui raízes reais";
    private static final String MSG_RAIZES_IGUAIS = "Esta equação possui duas raízes reais iguais: x' = x'' = ";
    private static final String MSG_RAIZES_DIFERENTES = "Esta equação possui duas raízes reais diferentes: delta = %.2f, x' = %.2f, x'' = %.2f%n";

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

    private static void resolverEquacao(double a, double b, double c) {
        if (isIgualdade(a, b, c)) {
            System.out.println(MSG_IGUALDADE);
        } else if (isCoeficientesIncorretos(a, b)) {
            System.out.println(MSG_COEF_INCORRETOS);
        } else if (isPrimeiroGrau(a)) {
            System.out.println(MSG_PRIMEIRO_GRAU + calcularRaizPrimeiroGrau(b, c));
        } else {
            System.out.println(MSG_SEGUNDO_GRAU);
            resolverEquacaoSegundoGrau(a, b, c);
        }
    }

    private static boolean isIgualdade(double a, double b, double c) {
        return a == 0 && b == 0 && c == 0;
    }

    private static boolean isCoeficientesIncorretos(double a, double b) {
        return a == 0 && b == 0;
    }

    private static boolean isPrimeiroGrau(double a) {
        return a == 0;
    }

    private static double calcularRaizPrimeiroGrau(double b, double c) {
        return -c / b;
    }

    private static void resolverEquacaoSegundoGrau(double a, double b, double c) {
        double delta = calcularDelta(a, b, c);

        if (delta < 0) {
            System.out.println(MSG_SEM_RAIZES_REAIS);
        } else if (delta == 0) {
            double raiz = calcularRaizUnica(a, b);
            System.out.println(MSG_RAIZES_IGUAIS + raiz);
        } else {
            calcularRaizesDiferentes(a, b, delta);
        }
    }

    private static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static double calcularRaizUnica(double a, double b) {
        return -b / (2 * a);
    }

    private static void calcularRaizesDiferentes(double a, double b, double delta) {
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf(MSG_RAIZES_DIFERENTES, delta, raiz1, raiz2);
    }
}
