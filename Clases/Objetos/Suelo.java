package Clases.Objetos;

public class Suelo {
    double disponibilidadAgua;
    double acidezSuelo;

    Suelo(){}
    Suelo(double dispAgua,double pH){
        this.acidezSuelo=pH;
        this.disponibilidadAgua=dispAgua;
    }

    public double getAcidezSuelo() {
        return acidezSuelo;
    }

    public double getDisponibilidadAgua() {
        return disponibilidadAgua;
    }

    public void setAcidezSuelo(double acidezSuelo) {
        this.acidezSuelo = acidezSuelo;
    }

    public void setDisponibilidadAgua(double disponibilidadAgua) {
        this.disponibilidadAgua = disponibilidadAgua;
    }
}
