import javax.swing.JOptionPane;

public class MediaIdades {

    public static void main(String[] args) {
        calcularMediaIdades();
    }
    //Declarar variáveis
    public static void calcularMediaIdades() {
        int soma = 0;
        int contador = 0;
        String input;
  //Ler as idades e calcular a soma
        do {
            input = JOptionPane.showInputDialog("Digite uma idade (ou 'fim' para encerrar):");
            if (!input.equalsIgnoreCase("fim")) {
                int idade = Integer.parseInt(input);
                soma += idade;
                contador++;
            }
        } while (!input.equalsIgnoreCase("fim"));
 //Calcular a média aritmética
        double media = (double) soma / contador;
 //Exibir o resultado para o usuário
        JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
    }
}
