package ads.poo.personagens;

public class Cavaleiro extends Boneco implements Guerreiro{

    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Caveleiro atacando";
    }

    @Override
    public String andar() {
        return "Cavaleiro andando";
    }
}
