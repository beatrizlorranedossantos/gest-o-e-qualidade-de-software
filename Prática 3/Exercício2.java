import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Informe o tipo de apartamento (S para simples, D para duplo):");
        char tipoApartamento = scanner.next().charAt(0);
        System.out.println("Informe a quantidade de dias hospedado:");
        int quantidadeDias = scanner.nextInt();
        double totalPago;

        if (tipoApartamento == 'S') {
            if (quantidadeDias < 10)
                totalPago = 100.0 * quantidadeDias;
            else if (quantidadeDias >= 10 && quantidadeDias <= 15)
                totalPago = 90.0 * quantidadeDias;
            else
                totalPago = 80.0 * quantidadeDias;
        } else {
            if (quantidadeDias < 10)
                totalPago = 140.0 * quantidadeDias;
            else if (quantidadeDias >= 10 && quantidadeDias <= 15)
                totalPago = 120.0 * quantidadeDias;
            else
                totalPago = 100.0 * quantidadeDias;
        }

        System.out.println("O total a ser pago é: " + totalPago);
