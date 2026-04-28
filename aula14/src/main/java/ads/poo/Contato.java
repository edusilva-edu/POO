package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private ArrayList<Email> emails;
    private ArrayList<Telefone> telefones;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Contato(String nome, String sobrenome, String dataString) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = LocalDate.parse(dataString, FORMATO);

        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public boolean addEmail(String endereco, String rotulo){
        boolean repetido = false;
        for(Email e : emails) {
            if (e.getEndereco().equals(endereco)) {
               repetido = true;
            }
        }
        if (!repetido) {
            this.emails.add(new Email(endereco, rotulo));
            return true;
        } else return false;
    }

    public boolean addTelefone(String numero, String rotulo){
        boolean repetido = false;
        for(Telefone t  : telefones) {
            if (t.getNumero().equals(numero)) {
                repetido = true;
            }
        }
        if (!repetido) {
            this.telefones.add(new Telefone(numero, rotulo));
            return true;
        } else return false;
    }

    public void removeEmail(String endereco){
        emails.removeIf(e -> e.getEndereco().equals(endereco));
    }

    public void removeTelefone(String numero){
        telefones.removeIf(t -> t.getNumero().equals(numero));
    }

    @Override
    public String toString() {
        return "Contato: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Data de nascimento: " + nascimento.format(FORMATO);
    }
}