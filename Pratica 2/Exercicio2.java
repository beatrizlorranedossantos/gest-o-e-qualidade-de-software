import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius:");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
