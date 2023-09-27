import Clases.*;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    Celda[][] arrayCeldas = new Celda[8][8];
    int limite = arrayCeldas.length;

        for (int i = 0; i<limite; i++){
            for (int j = 0;j<limite;j++){
                arrayCeldas[i][j] = new Celda(
                        (int)(Math.random() * 1000),
                        0,
                        0,
                        (Math.random() * 100),
                        (Math.random() * 3)+5);
            }
        }

        for (int i = 0; i<limite; i++){
            System.out.println("************************************************************\n");
            int b, h;
                b=(int)(Math.random()*8);
                h=(int)(Math.random()*8);
                System.out.println("Habitantes en (" + b + ", " + h + "): " + arrayCeldas[b][h].getHabitantes());

                b=(int)(Math.random()*8);
                h=(int)(Math.random()*8);
                System.out.println("Técnica en (" + b + ", " + h + "): " + arrayCeldas[b][h].getTecnica());

                b=(int)(Math.random()*8);
                h=(int)(Math.random()*8);
                System.out.println("Sociabilidad en (" + b + ", " + h + "): " + arrayCeldas[b][h].getSociabilidad());

                b=(int)(Math.random()*8);
                h=(int)(Math.random()*8);
                System.out.println("Disponibilidad de agua en (" + b + ", " + h + "): " + arrayCeldas[b][h].getDisponibilidadAgua());

                b=(int)(Math.random()*8);
                h=(int)(Math.random()*8);
                System.out.println("Acidez en (" + b + ", " + h + "): " + arrayCeldas[b][h].getAcidezSuelo());
            }

        }

    }
