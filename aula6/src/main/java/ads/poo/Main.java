package ads.poo;

public class Main {
    static void main(String[] args){

        Lampada a = new Lampada();

        IO.println(a.isLigada());
        IO.println(a.ligarDesligar());

        Lampada b = new Lampada();

        IO.println(a.isLigada());
        IO.println(b.isLigada());

    }
}