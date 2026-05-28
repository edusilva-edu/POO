package ads.poo;

import java.util.Arrays;

public class Disciplina {

    public String sigla;
//    String: doming, segunda-feira ?
//    int: 1 - dom, 2 - seg ? Melhor
    private DiaDaSemana[] aulas;

    public Disciplina(String sigla, DiaDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Sigla = " + sigla + '\n' +
                "Dias com aula = " + Arrays.toString(aulas);
    }
}