// Média aritmética e soma de duas médias

package mediaAritmetica;

public class Calculadora {
    private int a;
    private int b;
    private int c;

    public Calculadora(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double media() {
        int result = (this.a + this.b + this.c)/3;
        return result;
    }
    public double soma(double x, double y) {
        return x + y;
    }
}
