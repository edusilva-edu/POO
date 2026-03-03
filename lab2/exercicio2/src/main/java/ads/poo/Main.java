package ads.poo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        Random r = new Random();

        int i = r.nextInt(101);

        int palpite;
        int tentativas = 0;

        do {
        IO.println("Seu palpite: ");
        palpite = leitor.nextInt();
        if (palpite > i) {
            IO.println("Maior");
        } else if (palpite < i) {
            IO.println("Menor");
        } else {
            IO.println("Parabens, acertou!");
        }
        tentativas++;
        } while(palpite != i);

        IO.println("Número de tentativas: " + tentativas + ".");
    }
}