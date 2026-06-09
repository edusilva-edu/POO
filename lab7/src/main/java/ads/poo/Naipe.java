package ads.poo;

public enum Naipe {
    OUROS(1,"ouros", 'o'),
    ESPADAS(2,"espadas", 'e'),
    COPAS(3,"copas", 'c'),
    PAUS(4,"paus", 'p');

    private int valor;
    private String extenso;
    private char inicial;

    Naipe(int valor, String extenso, char inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }

    @Override
    public String toString() {
        return extenso;
    }
}
