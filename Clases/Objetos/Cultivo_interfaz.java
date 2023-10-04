package Clases.Objetos;

public interface Cultivo_interfaz {
    /*En el momento que se quiera cultivar algo en una casilla, a través de una instancia debería
    calcularse cuánto va a rendir el cultivo dado, sin especificar el cultivo*/
    float rendimiento(String nombre,float disponibibilidad_agua,float pHMin,float pHMax, float agua_suelo, float acidez_suelo );
}
