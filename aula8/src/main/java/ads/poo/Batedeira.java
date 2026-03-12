package ads.poo;

public class Batedeira {
    private double bolosPorMinuto;

    public void setBolosPorMinuto(double bpm){
        bolosPorMinuto = bpm;
    }

    public String baterBolos(double minutos){
        double bolos = bolosPorMinuto * minutos;
        return String.format("Você bateu %s bolos!", bolos);
    }
}