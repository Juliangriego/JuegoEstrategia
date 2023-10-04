package Clases.Objetos;

public class Cultivo_metodos implements Cultivo_interfaz {


    @Override
    public float rendimiento(String nombre,
                             float disponibibilidad_agua, float pHMin, float pHMax,
                             float agua_suelo, float acidez_suelo) {
        float rend,rend_agua,rend_agua_total,rend_acidez,rend_acidez_total;

        rend_agua = (disponibibilidad_agua-agua_suelo)/10;
        rend_agua_total = (float) (- (rend_agua*rend_agua) + 1.0);
        if ((acidez_suelo<pHMax)&&(acidez_suelo>pHMin)) {
            rend_acidez_total = 1;
        } else if (acidez_suelo<pHMin){
            rend_acidez = (pHMin-acidez_suelo)/10;
            rend_acidez_total = (float) (- (rend_acidez*rend_acidez) + 1.0);
        } else {
            rend_acidez = (pHMax-acidez_suelo)/10;
            rend_acidez_total = (float) (- (rend_acidez*rend_acidez) + 1.0);
        }
        rend = (rend_acidez_total + rend_agua_total)/2;
        return rend;
    }
}
