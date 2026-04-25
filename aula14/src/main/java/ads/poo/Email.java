package ads.poo;

public class Email {
    private String endereco;
    private String rotulo;

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

    public void setRotulo(int idRotulo) {
        switch (idRotulo){
            case 1 -> this.rotulo = "Pessoal";
            case 2 -> this.rotulo = "Comercial";
            default -> {}
        }
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
