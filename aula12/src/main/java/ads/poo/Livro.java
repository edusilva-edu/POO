package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        this.capitulos.add(new Capitulo(t));
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Capitulo cap : this.capitulos){

        }
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", capitulos=" + capitulos +
                '}';
    }
}
