import javax.swing.JOptionPane;

public class CalculoFatorial {

    public static void main(String[] args) {
        calcularFatorial();
    }
  //Solicitar o número ao usuário
    public static void calcularFatorial() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
 // Verificar se o número é válido  
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return;
        }
 //Calcular o fatorial do número
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
   //Exibir o resultado para o usuário
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }
}
