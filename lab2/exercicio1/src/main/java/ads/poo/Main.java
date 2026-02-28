package ads.poo;

public class Main {

    static void main() {

        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ");

        if (dia < 1 || dia > 31) {
            IO.println("Dia inválido");
        } else if (mes.equals("março") && dia > 20 || mes.equals("abril") || mes.equals("maio")|| mes.equals("junho") && dia < 20){
            IO.println("Outono");
        } else if (mes.equals("junho") || mes.equals("julho") || mes.equals("agosto")|| mes.equals("setembro") && dia < 23){
            IO.println("Inverno");
        } else if (mes.equals("setembro") || mes.equals("outubro") || mes.equals("novembro")|| mes.equals("dezembro") && dia < 22){
            IO.println("Primavera");
        } else if (mes.equals("dezembro") || mes.equals("janeiro") || mes.equals("fevereiro")|| mes.equals("março")){
            IO.println("Verão");
        } else {
            IO.println("Mês inválido.");
        }
    }
}