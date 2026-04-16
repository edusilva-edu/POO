package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean ligado;
    private ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, int numMotores, String tipo) {
        this.motores = new ArrayList<>();
        if (maxTripulantes > 0 && maxPassageiros > 0 && maxCombustivel > 0 && numMotores > 0 && numMotores <= 8){
            this.maxTripulantes = maxTripulantes;
            this.maxPassageiros = maxPassageiros;
            this.maxCombustivel = maxCombustivel;
        } else {
            this.maxTripulantes = 0;
            this.maxPassageiros = 0;
            this.maxCombustivel = 0;
            numMotores = 1;
        }

        for (int i = 0; i < numMotores; i++) {
            motores.add(new Motor(tipo));
        }
    }

    public void ligaDesliga(){
        ligado = !ligado;

        for (Motor motor : motores){
            motor.ligaDesliga();
        }
    }

    public boolean isLigado(){
        return ligado;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "maxTripulantes=" + maxTripulantes +
                ", maxPassageiros=" + maxPassageiros +
                ", maxCombustivel=" + maxCombustivel +
                ", ligado=" + ligado +
                ", motores=" + motores +
                '}';
    }
}
