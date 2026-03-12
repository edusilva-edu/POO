package ads.poo;

public class Contador {

    // Atributos
    private int contagem;

    // Métodos
    public void editar(int numero){
        contagem = numero;
    }

    public void incrementar(){
        contagem++;
    }

    public int mostrar(){
        return contagem;
    }
}
