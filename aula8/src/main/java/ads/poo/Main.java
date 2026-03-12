package ads.poo;

public class Main {
    static void main() {

//        Contador c = new Contador();
//
//        c.editar(4);
//        c.incrementar();
//        c.incrementar();
//        IO.println(c.mostrar());

//        Personagem josias = new Personagem();
//        josias.setName("Josias Caleb");
//        josias.setPontosDeVida(500);
//        josias.setClasse("Guerreiro");
//        josias.setForca(50);
//        josias.setArma("Massa");
//        josias.setForcaArma(2);
//        IO.println(josias.getName());
//        IO.println(josias.autoRetaliacao());
//        IO.println("HP" + josias.getPontosDeVida());

        Batedeira bat = new Batedeira();
        bat.setBolosPorMinuto(50);
        IO.println(bat.baterBolos(60));
    }
}
