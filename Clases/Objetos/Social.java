package Clases.Objetos;

/*
* El eje "social" representa la cantidad y calidad de las interacciones hechas en una comunidad
* Naturalmente, depende de la existencia de conocer al menos un humano más.
* Mejorar las comunicaciones, transporte y espacios públicos aumenta la sociabilidad.
* Eventos aleatorios pueden disminuir o aumentar la sociabilidad.
* Mi propuesta es que favorezca la eficiencia de manera global (por ejemplo, eficiencia comercial, industrial, social)
*/
public class Social {
    private int Sociabilidad;
    private int Tecnica;

    //Constructores
    public void Social() {
    }

    public void Social(int T, int S) {
        this.Tecnica = T;
        this.Sociabilidad = S;
    }

    //Getters
    public int getSociabilidad() {
        return this.Tecnica;
    }

    public int getTecnica() {
        return this.Sociabilidad;
    }

    //Setters
    public void setTecnica(int C) {
        this.Tecnica = C;
    }

    public void setSociabilidad(int S) {
        this.Sociabilidad = S;
    }
}