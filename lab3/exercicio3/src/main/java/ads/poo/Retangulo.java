package ads.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;

    public Retangulo(int largura, int altura, String codificacao) {
        if (largura <= 0 || altura <=0) {
            this.largura = 4;
            this.altura = 3;
        } else {
            this.largura = largura;
            this.altura = altura;
        }
        if (codificacao.equals("ASCII") || codificacao.equals("UTF8")) {
            this.codificacao = codificacao;
        } else {
            this.codificacao = "ASCII";
        }
    }
}
