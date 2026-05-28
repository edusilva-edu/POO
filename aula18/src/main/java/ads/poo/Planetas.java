package ads.poo;

public enum Planetas {

    MERCURIO(1, "mercúrio"),
    VENUS(2, "vênus"),
    TERRA(3, "terra"),
    MARTE(4, "marte"),
    JUPTER(5, "júpter"),
    SATURNO(6, "saturno"),
    URANO(7, "urano"),
    NETUNO(8, "netuno");

    private int posicao;
    private String nome;

    Planetas(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    public static Planetas getByCodigo(int posicao){
        for (Planetas p : Planetas.values()){
            if (p.posicao == posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }

    @Override
    public String toString() {
        return nome;
    }
}
