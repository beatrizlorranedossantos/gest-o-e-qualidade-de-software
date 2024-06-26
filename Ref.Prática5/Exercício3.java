import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            double lado01 = lerLado("primeiro");
            double lado02 = lerLado("segundo");
            double lado03 = lerLado("terceiro");

            determinarTipoTriangulo(lado01, lado02, lado03);

            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);
    }

    private static double lerLado(String ordem) {
        double lado = 0;
        boolean repetir;
        do {
            repetir = false;
            String resp = JOptionPane.showInputDialog("Informe o " + ordem + " lado:", 0);
            if (resp == null) {
                sairComAviso("O botão \"cancelar\" foi pressionado para sair do programa.");
            }
            try {
                lado = Double.parseDouble(resp);
            } catch (NumberFormatException e) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "ERRO: número não identificado.");
            }
        } while (repetir);
        return lado;
    }

    private static void determinarTipoTriangulo(double lado01, double lado02, double lado03) {
        if (lado01 == lado02 && lado02 == lado03) {
            JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
        } else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03) {
            JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
        }
    }

    private static void sairComAviso(String mensagem) {
        System.err.println("Aviso: " + mensagem);
        System.exit(0);
    }
}
