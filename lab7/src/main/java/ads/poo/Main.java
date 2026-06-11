package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class Main implements DrawListener{

    private Draw draw;
    private ArrayList<Carta> elemento;

    public Main(){

        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
    }

    @Override
    public void mouseClicked(double x, double y) {

//        CartaGrafica c = new CartaGrafica(Naipe.OUROS, Valor.DEZ, x, y);
//        if (c.clicouDentro(x, y)){
//            this.draw.picture(x,y,"cartas/fundoa.png");
//        } else {
//            c.desenhar(draw);
//        }


//        this.draw.picture(x,y,"cartas/1c.png");
        this.draw.show();
    }

    static void main() {

        Main app = new Main();

    }
}
