package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {
        Dimensao d = new Dimensao(1,2,3);
        Telefone t = new Telefone(1,"2","3",4,d);
        SemFio s = new SemFio(1,"2","3",4,d,6,7,8);

        Telefone a = new SemFio(1,"2", "3", 4, d, 6,7,8);

        s.getFrequencia();

        ((SemFio)a).getFrequencia();

        Telefone[] vetor = new Telefone[3];

        vetor[0] = t;
        vetor[1] = s;
        vetor[2] = a;

//        for (Telefone aux : vetor){
//            IO.println(aux.get????());
//        }

        for (Telefone aux : vetor){
            if(aux instanceof SemFio novo){
                IO.println(novo.getFrequencia());
            }
        }
    }
}
