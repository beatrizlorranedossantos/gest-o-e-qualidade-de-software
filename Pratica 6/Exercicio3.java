import javax.swing.JOptionPane;

public class MediaIdades {

    public static void main(String[] args) {
        calcularMediaIdades();
    }

    public static void calcularMediaIdades() {
        int soma = 0;
        int contador = 0;
        String input;

        do {
            input = JOptionPane.showInputDialog("Digite uma idade (ou 'fim' para encerrar):");
            if (!input.equalsIgnoreCase("fim")) {
                int idade = Integer.parseInt(input);
                soma += idade;
                contador++;
            }
        } while (!input.equalsIgnoreCase("fim"));

        double media = (double) soma / contador;

        JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
    }
}
