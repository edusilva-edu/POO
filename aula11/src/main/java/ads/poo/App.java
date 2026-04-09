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

        var novoLivro = new Livro(ano, titulo, isbn, autor);

        this.livros.put(isbn, novoLivro);
    }

    void listarTodosLivros() {
        for (String titulo : livros.keySet()) {
            IO.println("Livro: " + titulo);
        }
    }

    void listarLivrosPorAno() {
        String pesquisarAno = IO.readln("Pesquisar pelo ano: ");
        for (Livro livro : livros.values()){
            IO.println("Livro: " + livro.getTitulo());
        }
    }

    void menu(int opcao){

        while (opcao != 5) {

            String.format("""
                Menu
                1 - Cadastrar livro
                2 - Listar todos os livros
                3 - Listar todos os livros de um ano específico
                4 - Alterar dados de um livro
                5 - Sair""");

            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao){

                case 1 -> { cadastrar(); }

                case 2 -> { listarTodosLivros(); }

                case 3 -> { listarLivrosPorAno(); }

                case 4 -> {  }
            }
        }
    }

    static void main(String[] args){
        App app = new App();
        int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        app.menu(opcao);
    }
}
