package ads.poo;

import java.util.ArrayList;

public class App {
    private ArrayList<Conta> contas;

    void cadastrar(){
        var numero = Integer.parseInt(IO.readln("Número da conta: "));
        var nome = IO.readln("Nome do titular: ");
        var saldo = Integer.parseInt(IO.readln("Saldo: "));

        var novaConta = new Conta(numero, nome, saldo);

        this.contas.add(novaConta);
    }

    void listarTodasContas() {
        // For each
        for (Conta elemento : contas) {
            IO.println(elemento);
        }
    }

    void depositarEmConta(){
        var contaADepositar = Integer.parseInt(IO.readln("Conta para depositar: "));

        for (Conta numero : contas){
            if (numero.getNumero() == contaADepositar) {
                var saldoAnterior = numero.getSaldo();
                var valorDeposito = Integer.parseInt(IO.readln("Quanto quer depositar: "));
                numero.depositar(valorDeposito);
                if (saldoAnterior == numero.getSaldo()) {
                    IO.println("Não foi possível depositar");
                }
                return;
            }
        }
        IO.println("Conta inexistente.");
    }

    void sacarEmConta(){
        var contaASacar = Integer.parseInt(IO.readln("Conta para sacar: "));

        for (Conta numero : contas){
            if (numero.getNumero() == contaASacar){
                var valorSaque = Integer.parseInt(IO.readln("Quanto quer sacar: "));
                numero.sacar(valorSaque);
                break;
            } else {
                IO.println("Conta inexistente.");
            }
        }
    }

    public App() { this.contas = new ArrayList<>();}

    void menu(int opcao){

        while (opcao != 5) {

            String.format("""
                Menu
                1 - Cadastrar conta
                2 - Listar todas as contas
                3 - Depositar em uma conta
                4 - Sacar de uma conta
                5 - Sair""");

            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao){

                case 1 -> { cadastrar(); }

                case 2 -> { listarTodasContas(); }

                case 3 -> { depositarEmConta(); }

                case 4 -> { sacarEmConta(); }

                case 5 -> {  }
            }
        }
    }

    static void main(String[] args){
        App app = new App();
        int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        app.menu(opcao);
    }
}
