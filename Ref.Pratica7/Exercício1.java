import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = lerNome("primeiro nome");
        String nomeDoMeio = lerNome("nome do meio");
        String ultimoNome = lerNome("último nome");

        String nomeCompleto = formarNomeCompleto(primeiroNome, nomeDoMeio, ultimoNome);
        exibirNomeCompleto(nomeCompleto);
    }

    private static String lerNome(String tipoNome) {
        return JOptionPane.showInputDialog("Informe o " + tipoNome + ":");
    }

    private static String formarNomeCompleto(String primeiroNome, String nomeDoMeio, String ultimoNome) {
        return primeiroNome + " " + nomeDoMeio + " " + ultimoNome;
    }

    private static void exibirNomeCompleto(String nomeCompleto) {
        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto);
    }
}
