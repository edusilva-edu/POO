package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private HashMap<String, Email> emails;
    private HashMap<String, Telefone> telefones;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Contato(String nome, String sobrenome, String dataString) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = LocalDate.parse(dataString, FORMATO);

        this.emails = new HashMap<>();
        this.telefones = new HashMap<>();
    }

    public void addEmail(String endereco, int rotulo){
        Email e = new Email(endereco, rotulo);
        this.emails.put(endereco, e);
    }

    public void addTelefone(String numero, int rotulo){
        Telefone n = new Telefone(numero, rotulo);
        this.telefones.put(numero, n);
    }

    @Override
    public String toString() {
        return "Contato: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Data de nascimento: " + nascimento.format(FORMATO);
    }
}