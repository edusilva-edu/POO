package ads.poo;

public class App {
    static void main() {
        Livro l = new Livro("Livro", new Pessoa("Jonas", "jonas@hotmail.com"));

        l.adicionaCapitulo("Introdução");
        l.adicionaCapitulo("Conteúdo");
        l.adicionaCapitulo("Conclusão");

        IO.println(l);
    }
}
