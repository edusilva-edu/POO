package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

//        Caixa<String> c = new Caixa<>("Ola");
//
//        Caixa<Pessoa> d = new Caixa<>(new Pessoa("Jonas"));
//
//        // não pracisa de typecasting
//        String s = c.getConteudo();
//
//        // erro de compilação, tipos incompatíveis
//        // String errado = d.getConteudo();
//
//        ArrayList<String> array = new ArrayList<>();
//
//        HashMap<String, String> hashmap = new HashMap<>();


        Scanner leitor = new Scanner(System.in);
        int a, b;

        try{
            IO.println("Entre com o número: ");
            a = leitor.nextInt();
            IO.println("Entre com o número: ");
            b = leitor.nextInt();

            int res = a / b;

            IO.println(a + " dividido por " + b + " = " + res);
        } catch (InputMismatchException e) {
            System.err.println(("Só são permitidos números inteiros"));
            leitor.nextLine();
        } catch (ArithmeticException e) {
            System.err.println(("Não é permitido dividir por zero"));
            leitor.nextLine();
        } catch (Exception z) {
            System.err.println(("Comportamento inesperado!!!"));
        }

        leitor.close();
    }
}
