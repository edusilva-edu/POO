package ads.poo;

public class Caneta {

    // Atributos
    private String cor;

    private double nivelTinta;

    private boolean aberta;

    // Métodos
    public boolean abreFecha(){
        aberta = !aberta;
        return aberta;
    }

    public boolean isAberta(){
        return aberta;
    }

    public void setCor(String c){
        cor = c;
    }

    public void setNivelTinta(double carga){
        nivelTinta = carga;
    }

    public String getCor(){
        return cor;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    public String desenhar(int x1, int y1, int x2, int y2){

        if (aberta){
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double consumo = distancia * 0.01;

            if (nivelTinta >= consumo) {

                nivelTinta -= consumo;

                return String.format("Desenhei %s na cor %s", distancia, cor);
            }
            return "Tinta insuficiente";
        }

        return "Caneta fechada";
    }
}
