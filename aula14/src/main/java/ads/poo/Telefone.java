package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String numero;
    private String rotulo;

    public Telefone(String numero, String rotulo) {
        if (validaNumero(numero)) {
            this.numero = numero;
        }
        this.rotulo = rotulo;
    }

    public String getNumero() {
        return numero;
    }

    public boolean setNumero(String numero) {
        if (validaNumero(numero)) {
            this.numero = numero;
            return true;
        } else return false;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    private boolean validaNumero(String numero){
        String eR = "^[0-9]+$";
        return (numero.matches(eR) && numero.length() == 11) ;
    }

    private String formataNumero(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Telefone: " + formataNumero("(##) #####-####", numero) +
                " (" + rotulo + ")";
    }
}