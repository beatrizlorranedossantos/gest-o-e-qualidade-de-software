import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a diagonal maior do losango:");
        double diagonalMaior = scanner.nextDouble();
        System.out.println("Informe a diagonal menor do losango:");
        double diagonalMenor = scanner.nextDouble();
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + areaLosango);
