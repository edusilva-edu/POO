package ads.poo;

public class Carro {

    private String modelo;

    private int velocidadeAtual;

    private int velocidadeMax;

    public final int VEL_MAX_MODELOS = 300;
    public static final int VEL_MIN_MODELOS = 0;

    public Carro(String modelo) {
        this.velocidadeAtual = VEL_MIN_MODELOS;
        this.modelo = modelo;
        this.velocidadeMax = VEL_MAX_MODELOS;
    }

    public Carro(int velocidadeMax, String modelo) {
        if (velocidadeMax > VEL_MAX_MODELOS) {
            this.velocidadeMax = VEL_MAX_MODELOS;
        } else {
            this.velocidadeMax = velocidadeMax;
        }
        this.velocidadeAtual = VEL_MIN_MODELOS;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int i){
        if (velocidadeAtual + i < velocidadeMax) {
            velocidadeAtual += i;
        } else {
            velocidadeAtual = velocidadeMax;
        }
    }

    public void frear(int d){
        if (velocidadeAtual - d > VEL_MIN_MODELOS){
            velocidadeAtual -= d;
        } else {
            velocidadeAtual = VEL_MIN_MODELOS;
        }
    }
}