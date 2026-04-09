package ads.poo;

public class Livro {

    private String titulo;
    private String ano;
    private final String isbn;
    private String autor;

    public Livro(String titulo, String ano, String isbn, String autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro:" +
                "Titulo= " + titulo + '\'' +
                "Ano= '" + ano + '\'' +
                "ISBN= " + isbn + '\'' +
                "Autor= " + autor + '\'';
    }
}