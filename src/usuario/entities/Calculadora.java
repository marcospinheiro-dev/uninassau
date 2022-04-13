package usuario.entities;

public class Calculadora {
    private Usuario user;
    private String login = "ze";
    private String senha = "123456";

    public Calculadora(Usuario user) {
        this.user = user;
    }

    public String soma(double numA, double numB) {
        if (this.user.login(this.login, this.senha)) {
            return "A soma é: " + (numA + numB);
        }else{
            return "O usuário não tem acesso!";
        }
    }
    public String subtrai(double numA, double numB) {
        if (this.user.login(this.login, this.senha)) {
            return "A subtração é: " + (numA - numB);
        }else{
            return "O usuário não tem acesso!";
        }

    }
    public String mult(double numA, double numB) {
        if (this.user.login(this.login, this.senha)) {
            return "A multiplicação é: " + (numA * numB);
        }else{
            return "O usuário não tem acesso!";
        }

    }
    public String divide(double numA, double numB) {
        if (this.user.login(this.login, this.senha)) {
            return "A divisão é: " + (numA / numB);
        }else{
            return "O usuário não tem acesso!";
        }

    }
    public String funcao(double numA, double numX, double numB) {
        if (this.user.login(this.login, this.senha)) {
            return "A função é: " + ((numA * numX) + numB);
        }else{
            return "O usuário não tem acesso!";
        }
    }
    public String potencia(double x, int p) {
        if (this.user.login(this.login, this.senha)) {
            return "A potencia é: " + Math.pow(x, p);
        }else{
            return "O usuário não tem acesso!";
        }
//        if(p == 2) {
//
//            return  x * x;
//        }else{
//            double result = 1;
//            int contador = 0;
//            while (contador != p) {
//                result = result * x;
//                contador++;
//            }
//            System.out.print("A potencia é: ");
//            return result;
//
//        }
    }
}
