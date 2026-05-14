package ads.poo.produtos;

public class Telefone {
    protected int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone:" + "\n" +
                "codigo= " + codigo + "\n" +
                "numSerie= " + numSerie + "\n" +
                "modelo= " + modelo + "\n" +
                "peso= " + peso + "\n" +
                "dimensao= " + dimensao;
    }
}