package ipiPecas;

public class AppIpi {
    private static Pecas peca1;
    private static Pecas peca2;

    public static void main(String[] args) {

        peca1 = new Pecas(12,10, 10);
        peca2 = new Pecas(22, 20, 20);

        double somaTotalPecasComIpi = peca1.valorTotalProduto() + peca2.valorTotalProduto()
                + peca1.IPI(10) + peca2.IPI(10);

        System.out.println("O código da peca1 é: " + peca1.getCodPeca());
        System.out.printf("O valor da peça1 é: %.2f%n", peca1.valorTotalProduto());
        System.out.println("O código da peca2 é: " + peca2.getCodPeca());
        System.out.printf("O valor da peça2 é: %.2f%n", peca2.valorTotalProduto());
        System.out.printf("O IPI da peça1 é: %.2f%n", peca1.IPI(10));
        System.out.printf("O IPI da peça2 é: %.2f%n", peca2.IPI(10));
        System.out.printf("O valor total das peças com IPI é: %.2f%n", somaTotalPecasComIpi);

    }
}
