package ads.poo;

public class Main {
    static void main() {
        Ponto a = new Ponto(0,0);
        Ponto b = new Ponto(0, 1);

        IO.println(a.distancia(b));
    }
}
