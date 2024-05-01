import javax.swing.JOptionPane;

public class SomaNumerosImpares {

    public static void main(String[] args) {
        somaNumerosImpares();
    }

    public static void somaNumerosImpares() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int soma = 0;

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + num1 + " e " + num2 + " é: " + soma);
    }
}
