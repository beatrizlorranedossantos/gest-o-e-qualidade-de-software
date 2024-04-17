import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Caso a) - Informe o coeficiente 'a' da equação de segundo grau:");
        double a = scanner.nextDouble();
        System.out.println("Informe o coeficiente 'b' da equação de segundo grau:");
        double b = scanner.nextDouble();
        System.out.println("Informe o coeficiente 'c' da equação de segundo grau:");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        }
