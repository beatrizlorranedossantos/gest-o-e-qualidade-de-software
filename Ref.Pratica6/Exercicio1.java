public class Produto {
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
