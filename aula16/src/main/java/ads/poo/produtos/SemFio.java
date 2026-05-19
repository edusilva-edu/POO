package ads.poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distancia;

    @Override
    public String toString() {
        return "SemFio{" + "\n" +
                super.toString() + "\n" +
                "frequencia= " + frequencia + "\n" +
                "canais= " + canais + "\n" +
                "distancia=" + distancia;
    }

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;


    }

    public double getFrequencia() {
        return frequencia;
    }
}
