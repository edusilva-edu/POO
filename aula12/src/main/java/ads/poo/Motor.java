package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
        this.hp = 100;
        this.giroAtual = 0;
        this.cilindros = 6;
    }

    public void acelerar(int v){
        this.giroAtual++;
    }
}