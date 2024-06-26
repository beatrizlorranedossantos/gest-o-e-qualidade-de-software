import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1 = lerNumero("primeiro");
        int num2 = lerNumero("segundo");

        int opcao = escolherOperacao();
        realizarOperacao(num1, num2, opcao);
    }

    private static int lerNumero(String ordem) {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe o " + ordem + " número:"));
    }

    private static int escolherOperacao() {
        String menu = "Escolha uma operação:\n1 – Somar\n2 – Subtrair\n3 – Multiplicar\n4 – Dividir";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void realizarOperacao(int num1, int num2, int opcao) {
        double resultado = 0;
        boolean divisaoPorZero = false;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    divisaoPorZero = true;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        if (divisaoPorZero) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
        } else {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
