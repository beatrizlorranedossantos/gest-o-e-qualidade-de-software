Refatorações Aplicadas:

Introdução de Interface (InterfaceRelatorio) e Classe (Relatorio):

Motivo: Segregação de responsabilidades. O cálculo e a geração do relatório foram separados da classe Principal, facilitando a manutenção e possíveis extensões futuras.
Renomeação de Variáveis e Métodos:

Motivo: Melhorar a legibilidade e a clareza do código.
Uso de Listas Tipadas (ArrayList<Produto>):

Motivo: Uso de generics para evitar avisos de tipos não verificados e melhorar a segurança do tipo.
Possíveis Outras Refatorações:

Remoção de Magic Numbers:

Motivo: Substituir números mágicos por constantes nomeadas para melhorar a legibilidade e facilitar futuras alterações.
java
Copiar código
private static final double DESCONTO_VIP = 0.90;
private static final double DESCONTO_COMUM = 0.95;
private static final double TAXA_ENTREGA_DOMINGO = 10.00;
private static final double TAXA_ENTREGA_NORMAL = 5.00;
Extração de Métodos:

Motivo: Dividir métodos grandes em métodos menores e mais focados para melhorar a legibilidade e a reutilização.
java
Copiar código
private double calcularTotalProdutos() {
    double total = 0.0;
    for (Produto produto : produtos) {
        total += produto.getPreco() * produto.getQuantidade();
    }
    return total;
}

private double aplicarDesconto(double total) {
    return clienteVIP ? total * DESCONTO_VIP : total * DESCONTO_COMUM;
}

private double adicionarTaxaEntrega(double total) {
    DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
    return total + (diaSemana == DayOfWeek.SUNDAY ? TAXA_ENTREGA_DOMINGO : TAXA_ENTREGA_NORMAL);
}
Testes Unitários:

Motivo: Adicionar testes unitários para garantir que o comportamento do código permaneça correto após refatorações.
java
Copiar código
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RelatorioTest {

    @Test
    public void testCalcularTotalProdutos() {
        // Testes para o método calcularTotalProdutos
    }

    @Test
    public void testAplicarDesconto() {
        // Testes para o método aplicarDesconto
    }

    @Test
    public void testAdicionarTaxaEntrega() {
        // Testes para o método adicionarTaxaEntrega
    }
}
