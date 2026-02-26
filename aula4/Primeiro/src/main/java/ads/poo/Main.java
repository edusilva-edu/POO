package ads.poo;

public class Main {
    static void main() {

        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }

        // TODO finalizar
        int contador = 10;
        IO.println(contador++);
        // FIXME ajeitar
        IO.println(++contador);

    }
}
