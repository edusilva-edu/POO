package ads.poo;

public class Conta {
    private int numero;
    private String nome;
    private int saldo;

    public Conta(int numero, String nome, int saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public String depositar(int deposito){
        if(deposito > 0){
            this.saldo += deposito;
            return "Você depositou " + deposito + " R$.";
        } else {
            return "Não foi possível realizar o depósito.";
        }
    }

    public String sacar(int saque){
        if((this.saldo - saque) < 0 || saque < 0){
            return "Não foi possível realizar o depósito.";
        } else {
            this.saldo -= saque;
            return "Você sacou " + saque +" R$.";
        }
    }

    public String toString() {
        return "Número: " + numero + '\n' +
                "Titular: " + nome + '\n' +
                 "Saldo da conta: " + saldo + " R$";
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }
}
