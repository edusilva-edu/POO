package ads.poo;
    public class Main {
        static void main(String[] args){

            if (args.length == 0){
                IO.println("Não forneceu argumentos.");
            } else if (args[0].equals("triangulo")) {
                for (int i = 0; i < args.length; i++) {
                    for (int j = 0; j < args.length; j++) {
                        IO.print("*");
                    }
                }
            } else if (args[0].equals("losango")) {

            } else if (args[0].equals("retangulo")) {

            }
        }
}