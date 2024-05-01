import javax.swing.JOptionPane;

public class CalculoFatorial {

    public static void main(String[] args) {
        calcularFatorial();
    }

    public static void calcularFatorial() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return;
        }

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}
