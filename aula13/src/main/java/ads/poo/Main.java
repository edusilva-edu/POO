package ads.poo;


public class Main {
    static void main() {

        Aviao a = new Aviao(20,20, 20, 3, "Turbina");

        IO.println(a);

        a.ligaDesliga();

        IO.println(a);
    }
}
