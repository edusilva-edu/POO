package ads.poo.personagens;

public class Aldeao extends Boneco implements Guerreiro {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacando";
    }

    @Override
    public String andar() {
        return "Aldeão andando";
    }
}
