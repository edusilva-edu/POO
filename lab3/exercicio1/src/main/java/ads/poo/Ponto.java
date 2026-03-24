package ads.poo;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " +y + ")";
    }

    public double distancia(Ponto p) {
        double dist = Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));
        return dist;
    }
}
