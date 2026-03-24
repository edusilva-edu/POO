package ads.poo;

import java.awt.image.ImagingOpException;

public class Main {
    static void main() {
        Horario h = new Horario(25, 20, 20);
        IO.println(h);

        IO.println(h.setHoras(25));

        IO.println(h);

        IO.println(h.converterSegundos(h));
    }
}
