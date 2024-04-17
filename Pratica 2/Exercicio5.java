import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o raio da esfera:");
        double raio = scanner.nextDouble();
        double comprimentoEsfera = 2 * Math.PI * raio;
        double areaEsfera = Math.PI * Math.pow(raio, 2);
        double volumeEsfera = (3.0/4.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O comprimento da esfera é: " + comprimentoEsfera);
        System.out.println("A área da esfera é: " + areaEsfera);
        System.out.println("O volume da esfera é: " + volumeEsfera);

        scanner.close();
    }
}
