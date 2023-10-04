package Clases.Objetos;

public class Suelo {
    float disponibilidadAgua;
    float acidezSuelo;

    Suelo(){}
    Suelo(float dispAgua,float pH){
        this.acidezSuelo=pH;
        this.disponibilidadAgua=dispAgua;
    }

    public float getAcidezSuelo() {
        return acidezSuelo;
    }

    public float getDisponibilidadAgua() {
        return disponibilidadAgua;
    }

    public void setAcidezSuelo(float acidezSuelo) {
        this.acidezSuelo = acidezSuelo;
    }

    public void setDisponibilidadAgua(float disponibilidadAgua) {
        this.disponibilidadAgua = disponibilidadAgua;
    }
}
