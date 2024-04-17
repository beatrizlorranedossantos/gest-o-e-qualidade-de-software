import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do cliente:");
        int idade = scanner.nextInt();
        System.out.println("Informe o sexo do cliente (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);
        double mensalidade;

        if (sexo == 'M') {
            if (idade <= 15)
                mensalidade = 60.0;
            else if (idade >= 16 && idade <= 18)
                mensalidade = 75.0;
            else if (idade >= 19 && idade <= 30)
                mensalidade = 90.0;
            else if (idade >= 31 && idade <= 40)
                mensalidade = 85.0;
            else
                mensalidade = 80.0;
        } else {
            if (idade <= 18)
                mensalidade = 60.0;
            else if (idade >= 19 && idade <= 25)
                mensalidade = 90.0;
            else if (idade >= 26 && idade <= 40)
                mensalidade = 85.0;
            else
                mensalidade = 80.0;
        }

        System.out.println("A mensalidade a ser paga é: " + mensalidade);
