package ads.poo;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {
        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);

        draw.enableDoubleBuffering();

//        draw.circle(400, 400, 220);
//
//        draw.setPenColor(Color.RED);
//
//        draw.filledCircle(400,400,50);
//
//        draw.line(50.0,50.0,50.0, 50.0);
//
//        draw.rectangle(100,100,400,);
//        double[] x = {100,150,250,300};
//        double[] y = {100,150,150,100};
//
//        draw.filledPolygon(x,y);

//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i,0, i, 800);
//            draw.line(0, i,800, i);
//        }


        draw.setFontSize(300);



        for (int i = 0; i < 1; i++) {
            draw.clear();
            draw.text(400, 400, "" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

        draw.setPenColor(Color.RED);

        draw.filledCircle(500,530,100);
        draw.filledCircle(300,530,100);

        double[] a = {};
        double[] b = {};

        draw.filledPolygon(a, b);




        draw.show();
    }
}
