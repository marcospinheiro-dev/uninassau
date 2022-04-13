// Informar um saldo e imprimir o saldo com reajuste de 1%.

package saldo;

public class Saldo {

    private double saldoInicial;


    public Saldo(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double saldoAtual() {
        return this.saldoInicial + (this.saldoInicial * 1 / 100);
    }

}
