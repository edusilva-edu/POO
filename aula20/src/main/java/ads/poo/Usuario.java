package ads.poo;

public class Usuario {
    private String nome;
    private int nEmprestimos;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getnEmprestimos() {
        return nEmprestimos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
