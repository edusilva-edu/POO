package ads.poo;

public class Main {
    static void main(String[] args) {

        Carro c = new Carro(120, "Corsa");

        Carro d = new Carro("Celta");

        Pessoa p = new Pessoa("Úrsula","111.222.333-44","ursula@gmail.com");

        IO.println(p.toString());
    }
}
