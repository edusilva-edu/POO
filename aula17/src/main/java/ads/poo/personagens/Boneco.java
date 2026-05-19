package ads.poo.personagens;

public abstract class Boneco {

    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Boneco(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

//    public String atacar(){
//        return "está atacando com força ";
//    }

    public String andar(){
        return "está andando com velocidade ";
    }
}
