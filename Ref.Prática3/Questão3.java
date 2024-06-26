public class Main {
    public static void main(String[] args) {
        double vet1[] = { 90, 88, 78, 76 };
        double vet2[] = { 865, 564, 43, 12 };

        System.out.println("Média do vetor 1: " + calcularMedia(vet1));
        System.out.println("Média do vetor 2: " + calcularMedia(vet2));
    }

    private static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
}
