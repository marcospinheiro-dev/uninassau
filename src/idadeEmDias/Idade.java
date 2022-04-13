// Mostrar a idade total em dais.

package idadeEmDias;

public class Idade {

    private int idadeAno;
    private int idadeMes;
    private int idadeDia;

    public Idade(int idadeAno, int idadeMes, int idadeDia) {
        this.idadeAno = idadeAno;
        this.idadeMes = idadeMes;
        this.idadeDia = idadeDia;
    }

    public double totalEmDias() {
        return (this.idadeAno * 365) + (this.idadeMes * 30) + this.idadeDia;
    }
}
