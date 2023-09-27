package Clases;
import Clases.Objetos.*;

public class Celda {
    int habitantes;
    private int Sociabilidad;
    private int Tecnica;
    double disponibilidadAgua;
    double acidezSuelo;


    public Celda(int h,int T, int S, double dispAgua, double pH){
        this.habitantes = h;
        this.Tecnica = T;
        this.Sociabilidad = S;
        this.acidezSuelo=pH;
        this.disponibilidadAgua=dispAgua;
    }

    //Getters
    public int getHabitantes(){
        return this.habitantes;
    }
    public int getSociabilidad() {
        return this.Tecnica;
    }
    public int getTecnica() {
        return this.Sociabilidad;
    }
    public double getAcidezSuelo() {
        return acidezSuelo;
    }
    public double getDisponibilidadAgua() {
        return disponibilidadAgua;
    }

    //Setters
    public void setHabitantes(int h){
        this.habitantes=h;
    }
    public void setTecnica(int C) {

        this.Tecnica = C;
    }
    public void setSociabilidad(int S) {

        this.Sociabilidad = S;
    }
    public void setAcidezSuelo(double acidezSuelo) {
        this.acidezSuelo = acidezSuelo;
    }
    public void setDisponibilidadAgua(double disponibilidadAgua) {
        this.disponibilidadAgua = disponibilidadAgua;
    }
}


