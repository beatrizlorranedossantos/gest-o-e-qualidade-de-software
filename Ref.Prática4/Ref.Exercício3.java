import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double nota = lerNota();
        double salario = lerSalario();
        String sexo = lerSexo();
        int idade = lerIdade();

        JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
        JOptionPane.showMessageDialog(null, "Salário informado: " + salario);
        JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);
        JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
    }

    private static double lerNota() {
        double nota = 0;
        boolean repetir;
        do {
            repetir = false;
            String resp = JOptionPane.showInputDialog("Informe a nota [0, 10]", 0);
            if (resp == null) {
                sairComAviso("O botão \"cancelar\" foi pressionado.");
            }
            try {
                nota = Double.parseDouble(resp);
                if (nota < 0 || nota > 10) {
                    repetir = true;
                    JOptionPane.showMessageDialog(null, "Nota inválida. Deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "ERRO: número não identificado.");
            }
        } while (repetir);
        return nota;
    }

    private static double lerSalario() {
        double salario = 0;
        boolean repetir;
        do {
            repetir = false;
            String resp = JOptionPane.showInputDialog("Informe o salário", 0);
            if (resp == null) {
                sairComAviso("O botão \"cancelar\" foi pressionado.");
            }
            try {
                salario = Double.parseDouble(resp);
                if (salario <= 0) {
                    repetir = true;
                    JOptionPane.showMessageDialog(null, "Salário inválido. Deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "ERRO: número não identificado.");
            }
        } while (repetir);
        return salario;
    }

    private static String lerSexo() {
        String sexo;
        boolean repetir;
        do {
            repetir = false;
            sexo = JOptionPane.showInputDialog("Informe o sexo");
            if (sexo == null) {
                sairComAviso("O botão \"cancelar\" foi pressionado.");
            }
            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "Sexo inválido. Deve ser 'm' ou 'f'.");
            }
        } while (repetir);
        return sexo;
    }

    private static int lerIdade() {
        int idade = 0;
        boolean repetir;
        do {
            repetir = false;
            String resp = JOptionPane.showInputDialog("Informe a idade", 6);
            if (resp == null) {
                sairComAviso("O botão \"cancelar\" foi pressionado.");
            }
            try {
                idade = Integer.parseInt(resp);
                if (idade < 6 || idade > 150) {
                    repetir = true;
                    JOptionPane.showMessageDialog(null, "Idade inválida. Deve estar entre 6 e 150.");
                }
            } catch (NumberFormatException e) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "ERRO: número não identificado.");
            }
        } while (repetir);
        return idade;
    }

    private static void sairComAviso(String mensagem) {
        System.err.println("Aviso: " + mensagem);
        System.exit(1);
    }
}
