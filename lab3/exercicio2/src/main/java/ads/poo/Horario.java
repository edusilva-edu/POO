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

    public long converterSegundos(Horario h){
        int s = horas * 3600 + minutos * 60 + segundos;
        return s;
    }
}
