package ads.poo;

import java.util.HashMap;

public class App {

    public App(){ livros = new HashMap<>(); }

    private HashMap<String, Livro> livros;

    void cadastrar(){
        var titulo = IO.readln("Nome do livro: ");
        var ano = IO.readln("Ano de publicação: ");
        var isbn = IO.readln("ISBN: ");
        var autor = IO.readln("Autor: ");

        var novoLivro = new Livro(titulo, ano, isbn, autor);

        this.livros.put(isbn, novoLivro);
    }

    void listarTodosLivros() {
        IO.println("Livros cadastrados:");
        IO.println("-------------------");
    for (Livro livro : livros.values()) {
        IO.println("Título: " + livro.getTitulo());
        IO.println("Autor: " + livro.getAutor());
        IO.println("Ano: " + livro.getAno());
        IO.println("ISBN: " + livro.getIsbn());
        IO.println("-------------------");
    }
}

    void listarLivrosPorAno() {
        String pesquisaAno = IO.readln("Pesquisar pelo ano: ");
        IO.println("Livros publicados no ano " + pesquisaAno + ":");
        IO.println("-------------------");
        for (Livro livro : livros.values()){
            if (pesquisaAno.equals(livro.getAno())) {
                IO.println("Livro: " + livro.getTitulo());
            }
        }
    }

    void menu(){
        int opcao;

        do {
            IO.println("""
                Menu
                1 - Cadastrar livro
                2 - Listar todos os livros
                3 - Listar todos os livros de um ano específico
                4 - Alterar dados de um livro
                5 - Sair""");

            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao){

                case 1 -> cadastrar();

                case 2 -> listarTodosLivros();

                case 3 -> listarLivrosPorAno();
                
                case 4 -> { }
            }

        } while (opcao != 5);
    }

    static void main(String[] args){
        App app = new App();
        app.menu();
    }
}
