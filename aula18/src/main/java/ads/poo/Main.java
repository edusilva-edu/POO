package ads.poo;

public class Main {
    static void main() {

//        Disciplina poo = new Disciplina("POO",
//                new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.QUINTA});
//
//        // Dados: int
//        // Interface: texto
//
//        String sigla = IO.readln("Entre com a sigla: ");
//        int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia: "));
//        int dia2 = Integer.parseInt(IO.readln("Entre com o segunda dia: "));
//
//        Disciplina fei = new Disciplina(sigla, new DiaDaSemana[]{DiaDaSemana.getByCodigo(dia1), DiaDaSemana.getByCodigo(dia2)});
//        IO.println(fei);

        // Planetas
        IO.println(Planetas.getByCodigo(9));
    }
}
