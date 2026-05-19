package ads.poo.personagens;

public class Arqueiro extends Boneco implements Guerreiro{

    public Arqueiro() {
        super(35, 2, 1.0);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando";
    }

    @Override
    public String andar() {
        return "Arqueiro andando";
    }
}
