import java.util.List;
import java.util.ArrayList;

public class Artista {
    protected String nome;
    protected String generoMusical;
    protected List<Disco> discos;
    protected List<Genero> generos;


    public Artista(){
        this.discos = new ArrayList<>();
        this.generos = new ArrayList<>();
    }


    public Artista(String nome, String generoMusical) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.discos = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }



    public String getGeneroMusical() {
        return generoMusical;
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void adicionarGenero(Genero genero) {generos.add(genero);
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public String toString() {
        String discosAssociados = "";
        for (Disco disco : discos) {
            discosAssociados += "\n" + disco.getTitulo();
        }
        String generosAssociados = "";
        for (Genero genero : generos) {
            generosAssociados += "\n" + genero.getNome();
        }
        return "Nome do Artista: " + nome
                + "\nGenero Musical do Artista: " + generosAssociados
                + "\nDiscos Associados: " + discosAssociados;
    }
}

