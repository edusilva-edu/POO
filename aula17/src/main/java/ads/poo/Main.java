package ads.poo;

import ads.poo.personagens.Aldeao;
import ads.poo.personagens.Arqueiro;
import ads.poo.personagens.Boneco;
import ads.poo.personagens.Cavaleiro;

import java.util.ArrayList;

public class Main{
    static void main(String[] args) {
//        Aldeao al = new Aldeao();
//        Arqueiro verde = new Arqueiro();
//        Cavaleiro dasTrevas = new Cavaleiro();
//
//        IO.println(al.atacar());
//        IO.println(al.coletarMadeira());
//        IO.println();

        ArrayList<Boneco> bonecos = new ArrayList<>();

        bonecos.add(new Aldeao());
        bonecos.add(new Arqueiro());
        bonecos.add(new Cavaleiro());

        for (Boneco b : bonecos){
            IO.println(b.andar()); // Polimorfismo
        }
    }
}
