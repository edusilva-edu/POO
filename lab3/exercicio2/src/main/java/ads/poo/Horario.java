package ads.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Horario(int horas) {
        if (horas < 24 && horas >= 0) {
            this.horas = horas;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public Horario(int horas, int minutos) {
        if (horas < 24 && minutos < 60 && horas >= 0 && minutos >= 0) {
            this.horas = horas;
            this.minutos = minutos;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public Horario(int horas, int minutos, int segundos) {
        if (horas < 24 && minutos < 60 && segundos < 60 && horas >= 0 && minutos >= 0 && segundos >= 0) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }

    }

    public boolean setHoras(int horas) {
        if (horas < 24 && horas >= 0) {
            this.horas = horas;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinutos(int minutos) {
        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundos(int segundos) {
        if (segundos < 60 && segundos >= 0) {
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public long converterSegundos(){
        int s = horas * 3600 + minutos * 60 + segundos;
        return s;
    }

    public long diferencaHorario(Horario h){
        long diferenca = Math.abs(h.converterSegundos() - this.converterSegundos());
        return diferenca;
    }

    private String converterParaExtenso(int valor){
        return switch (valor){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "";
        };
    }

    public String porExtenso(){
        String concatenaH;
        String concatenaM;
        String concatenaS;

        if(horas > 20) {
            int dezenaHora = (horas / 10) * 10;
            int unidadeHora = horas % 10;
            concatenaH = converterParaExtenso(dezenaHora) + " e " +
                    converterParaExtenso(unidadeHora);
        } else {
            concatenaH = converterParaExtenso(horas);
        }

        if (minutos > 20) {
            int dezenaMinutos = (minutos / 10) * 10;
            int unidadeMinutos = minutos % 10;
            concatenaM = converterParaExtenso(dezenaMinutos) + " e " +
                    converterParaExtenso(unidadeMinutos);
        } else {
            concatenaM = converterParaExtenso(minutos);
        }

        if (segundos > 20){
            int dezenaSegundos = (segundos / 10) * 10;
            int unidadeSegundos = segundos % 10;
            concatenaS = converterParaExtenso(dezenaSegundos) + " e " +
                    converterParaExtenso(unidadeSegundos);
        } else {
            concatenaS = converterParaExtenso(segundos);
        }


        return concatenaH + " horas " +
                concatenaM + " minutos " +
                concatenaS + " segundos ";
    }
}
