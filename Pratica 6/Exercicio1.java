import javax.swing.JOptionPane;

public class SomaNumerosImpares {
    
    public static void main(String[] args) {
        somaNumerosImpares();
    }

     //Solicitar os dois números inteiros positivos ao usuário
    public static void somaNumerosImpares() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int soma = 0;
   //Calcular a soma dos números ímpares entre os dois limites
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
     //Exibir o resultado para o usuário
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + num1 + " e " + num2 + " é: " + soma);
    }
}
