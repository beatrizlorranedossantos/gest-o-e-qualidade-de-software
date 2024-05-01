import javax.swing.JOptionPane;

public class MaiorMenorNumero {

    public static void main(String[] args) {
        encontrarMaiorMenor();
    }
 //Declarar variáveis
    public static void encontrarMaiorMenor() {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        String input;
 //Ler os números e atualizar o maior e o menor
        do {
            input = JOptionPane.showInputDialog("Digite um número (ou 'fim' para encerrar):");
            if (!input.equalsIgnoreCase("fim")) {
                int numero = Integer.parseInt(input);
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (!input.equalsIgnoreCase("fim"));
//Exibir o maior e o menor número para o usuário
        JOptionPane.showMessageDialog(null, "O maior número digitado é: " + maior + "\nO menor número digitado é: " + menor);
    }
}
