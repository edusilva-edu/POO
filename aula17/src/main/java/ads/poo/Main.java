package ads.poo;

import ads.poo.personagens.Aldeao;
import ads.poo.personagens.Arqueiro;
import ads.poo.personagens.Boneco;
import ads.poo.personagens.Cavaleiro;

public class Main{
    static void main(String[] args) {
        Aldeao al = new Aldeao();
        Arqueiro verde = new Arqueiro();
        Cavaleiro dasTrevas = new Cavaleiro();

        IO.println(al.atacar());
    }
}
