/*
Escrever um algoritmo que lê:-a porcentagem do IPI a ser acrescido no valor das peças-o código da peça1, valor unitário da peça 1,
quantidade de peças 1-o código da peça 2, valor unitário da peça 2, quantidade de peças 2-O algoritmo deve calcular o valor total
a ser pago e apresentar o resultado.Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
package ipiPecas;

public class Pecas {
    //private double IPI;
    //private double porcentagem;
    private int codPeca;
    private double valorPeca;
    private int qtdPeca;

    public Pecas(int codPeca, double valorPeca, int qtdPeca) {
        this.codPeca = codPeca;
        this.valorPeca = valorPeca;
        this.qtdPeca = qtdPeca;
    }

    public double valorTotalProduto() {
        return (this.valorPeca * this.qtdPeca);
    }
    public double IPI(double porcentagem) {
        return valorTotalProduto() * porcentagem / 100;
    }

    public int getCodPeca() {
        return codPeca;
    }

    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }

    public int getQtdPeca() {
        return qtdPeca;
    }

    public void setQtdPeca(int qtdPeca) {
        this.qtdPeca = qtdPeca;
    }
}
