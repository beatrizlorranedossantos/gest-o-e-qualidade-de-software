import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Informe o salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");

