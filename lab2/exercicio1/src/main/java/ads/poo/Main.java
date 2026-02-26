package ads.poo;

public class Main {

    static void main() {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        String mes = IO.readln("Entre com o mês: ");

        // TODO terminar
        if (mes.equals("março") && dia > 19 || mes.equals("abril") || mes.equals("maio")|| mes.equals("junho") && dia < 21){
            IO.println("Outono");
        } else if (mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro") && dia ){

        }
    }
}

