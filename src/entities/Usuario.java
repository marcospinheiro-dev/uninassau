package entities;

public class Usuario {

    private String nome;
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public boolean login(String login, String senha) {
        if(login == this.login && senha == this.senha) {
            return true;
        }else{
            return false;
        }
    }

    public double soma(double numA, double numB) {
        return numA + numB;
    }
    public double subtrai(double numA, double numB) {
        return numA - numB;
    }
    public double mult(double numA, double numB) {
        return numA * numB;
    }
    public double divide(double numA, double numB) {
        return numA / numB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
