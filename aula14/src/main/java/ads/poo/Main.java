package ads.poo;

import java.time.LocalDate;

public class Main {
    static void main() {
        Contato c = new Contato("Edu", "ardo", "20/04/1951");

        c.addEmail("silvaeduardovanildo@gmail.com", 1);
        c.addTelefone("48991884632", 1);

        IO.println(c);
    }
}
