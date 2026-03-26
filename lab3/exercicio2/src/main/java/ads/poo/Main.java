package ads.poo;

import java.awt.image.ImagingOpException;

public class Main {
    static void main() {
        Horario h = new Horario(20, 34, 22);
        Horario j = new Horario(1);
        IO.println(h);

        IO.println(h.setHoras(25));

        IO.println(j);

        IO.println(j.converterSegundos());

        IO.println(h.diferencaHorario(j));

        IO.println(h.porExtenso());
    }
}
