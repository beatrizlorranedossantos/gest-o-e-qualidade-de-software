import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            produtos.add(cadastrarProduto());

            opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro produto?", "Cadastro de Produtos", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);

        exibirTotais(produtos);
    }

    private static Produto cadastrarProduto() {
        String codigo = JOptionPane.showInputDialog("Informe o código do produto:");
        String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
        String tipo = JOptionPane.showInputDialog("Informe o tipo do produto (roupas, calçados, casa):");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));

        return new Produto(codigo, nome, tipo, valor);
    }

    private static void exibirTotais(List<Produto> produtos) {
        double totalSemDesconto = 0;
        double totalComDesconto = 0;

        for (Produto produto : produtos) {
            totalSemDesconto += produto.getValor();
            totalComDesconto += produto.getValorComDesconto();
        }

        JOptionPane.showMessageDialog(null, "Total de produtos vendidos sem desconto: " + totalSemDesconto);
        JOptionPane.showMessageDialog(null, "Total de produtos vendidos com desconto: " + totalComDesconto);
    }
}

class Produto {
    private String codigo;
    private String nome;
    private String tipo;
    private double valor;
    private double desconto;

    public Produto(String codigo, String nome, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.desconto = calcularDesconto(tipo);
    }

    private double calcularDesconto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "roupas":
                return 0.05;
            case "calçados":
                return 0.04;
            case "casa":
                return 0.03;
            default:
                return 0;
        }
    }

    public double getValor() {
        return valor;
    }

    public double getValorComDesconto() {
        return valor * (1 - desconto);
    }
}
