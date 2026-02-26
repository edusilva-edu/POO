package ads.poo;

public class Main {
    static void main() {

        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }

        int contador = 10;
        IO.println(contador++);
        IO.println(++contador);

    }
}
