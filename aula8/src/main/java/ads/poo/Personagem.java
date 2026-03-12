package ads.poo;

public class Personagem {

    // Atributos
    private String nome;
    private String classe;
    private String arma;
    private int pontosDeVida;
    private int forca;
    private int forcaArma;

    public void setName(String newName){
        nome = newName;
    }

    public void setClasse(String newClass){
        classe = newClass;
    }

    public void setArma(String newArm){
        arma = newArm;
    }

    public void setPontosDeVida(int hp){
        pontosDeVida = hp;
    }

    public void setForca(int newForca){
        forca = newForca;
    }

    public void setForcaArma(int newForcaArma){
        forcaArma = newForcaArma;
    }

    public String getName(){
        return nome;
    }

    public int getForca(){
        return forca;
    }

    public int getPontosDeVida(){
        return pontosDeVida;
    }

    public String getArma(){
        return arma;
    }

    public String getClasse(){
        return classe;
    }

    public int autoRetaliacao(){
        int dano = forca * forcaArma;
        pontosDeVida -= dano;
        return dano;
    }
}
