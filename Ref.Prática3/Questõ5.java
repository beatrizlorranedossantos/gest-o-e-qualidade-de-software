Extração de Método (calcularMedia):

Motivo: A lógica de calcular a média foi extraída para um método separado. Isso melhora a clareza e a reutilização do código, evitando duplicação de código e tornando o main mais limpo e legível.
Uso de foreach:

Motivo: O loop for foi substituído por um loop foreach, que é mais conciso e legível quando se percorre todos os elementos de um array.
Uso de vetor.length em vez de um valor fixo:

Motivo: Em vez de usar o valor fixo 4, usamos vetor.length para garantir que o cálculo da média funcione corretamente para vetores de qualquer tamanho, tornando o código mais robusto e flexível.
