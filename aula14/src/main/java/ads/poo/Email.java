package ads.poo;

public class Email {
    private String endereco;
    private String rotulo;

    public Email(String endereco, String rotulo) {
        if (validaEndereco(endereco)) {
            this.endereco = endereco;
        }
        this.rotulo = rotulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean setEndereco(String endereco) {
        if (validaEndereco(endereco)) {
            this.endereco = endereco;
            return true;
        } else return false;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public boolean validaEndereco(String email) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return email.matches(eR);
    }

    @Override
    public String toString() {
        return "E-mail: " + endereco +
                " (" + rotulo + ")";
    }
}
