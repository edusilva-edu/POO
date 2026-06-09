package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private int x;
    private int y;

    public CartaGrafica(Naipe naipe, Valor valor, int x, int y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        d.picture(x, y, this.valor + String.valueOf(this.naipe) + ".png");
        d.show();
    }

    public boolean clicouDentro(){

    }

}
