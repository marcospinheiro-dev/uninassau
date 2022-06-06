package arrayList;
import java.util.ArrayList;


public class ArrayListaSimples {
    public static void main(String[] args) {
        ArrayList<String> listaDeAlunos = new ArrayList<String>();
        listaDeAlunos.add("Marcos");
        listaDeAlunos.add("joão");
        listaDeAlunos.add("Lucas");
        listaDeAlunos.add("Adelly");

        for (int i = 0; i < listaDeAlunos.size(); i++) {
            System.out.println("Aluno: " + listaDeAlunos.get(i));
        }
        listaDeAlunos.add("Anna");
        listaDeAlunos.remove(1);
        for (int i = 0; i < listaDeAlunos.size(); i++) {
            System.out.println("Aluno atual: " + listaDeAlunos.get(i));
        }
    }
}
