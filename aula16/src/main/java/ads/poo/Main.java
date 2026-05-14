package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {
        Dimensao d = new Dimensao(1,2,3);
        Telefone t = new Telefone(1,"2","3",4,d);
        SemFio s = new SemFio(1,"2","3",4,d,6,7,8);
        IO.println(t);
        IO.println(s);
    }
}
