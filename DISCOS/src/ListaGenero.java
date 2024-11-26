import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListaGenero {
    private List<Genero> generos;

    public ListaGenero() {
        this.generos = new ArrayList<>();
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void adicionarGeneros(Genero genero) {
        generos.add(genero);
        System.out.println("Genero adicionado a lista : " + genero.nomeG);
    }

    public void removerGenero(String nome) {
        Iterator<Genero> iterator = generos.iterator();
        boolean removido = false;

        while (iterator.hasNext()) {
            Genero genero = iterator.next();

            if (genero.nomeG.trim().equalsIgnoreCase(nome.trim())) {
                iterator.remove();
                removido = true;
                System.out.println("Genero removido da lista: " + genero.nomeG);
                break;
            }
        }

        if (!removido) {
            System.out.println("Genero Nao encontrado.");
        }
    }

    public void exibirListaGenero() {
        if (generos.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Lista dos generos:");
            for (Genero genero : generos) {
                System.out.println(genero);
            }
        }
    }

}