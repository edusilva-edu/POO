package ads.poo;

public class Motor {
    private String tipo;
    private boolean ligado;

    public Motor(String tipo){
        this.tipo = tipo;
    }

    public void ligaDesliga(){
        ligado = !ligado;
    }

    public boolean isLigado(){
        return ligado;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", ligado=" + ligado +
                '}';
    }
}