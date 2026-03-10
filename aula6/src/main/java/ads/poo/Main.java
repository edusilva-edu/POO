package ads.poo;

public class Main {
    static void main(String[] args){

//        Lampada a = new Lampada();
//
//        IO.println(a.isLigada());
//        IO.println(a.ligarDesligar());
//
//        Lampada b = new Lampada();
//
//        IO.println(a.isLigada());
//        IO.println(b.isLigada());

        Caneta bic = new Caneta();

        bic.setCor("azul"); // Atribunido a cor azul

        bic.setNivelTinta(0.02); // Atribunido o nivel de tinta

        String cor = bic.getCor();

        bic.abreFecha(); // Abrindo tampa

        double nivelTinta = bic.getNivelTinta();

        IO.println(bic.getNivelTinta());

        IO.println(bic.desenhar(0, 0, 0, 2));

        IO.println(bic.getNivelTinta());
    }
}