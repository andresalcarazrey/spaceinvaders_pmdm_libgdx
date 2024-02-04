package com.politecnicomalaga.spaceinvaders.model;

import java.util.ArrayList;

public class Escuadron {

    private ArrayList<NaveEnemiga> malotes;

    public Escuadron(int ancho, int posY, float velX, float velY, Dibujable imagen, Dibujable explosion, Dibujable iDisparo, int numNaves) {
        malotes = new ArrayList<>();

        int desplazamiento = ancho/(numNaves+1);
        int posX=desplazamiento;
        for (int i = 0;i<numNaves;i++) {
            NaveEnemiga n = new NaveEnemiga(posX,posY,velX,velY,imagen,explosion,iDisparo);
            malotes.add(n);
            posX+=desplazamiento;
        }
    }

    //Moverse
    public void mover() {
        for (NaveEnemiga cualquiera: malotes) {
            cualquiera.moverse();
        }

    }


    //Dibujarse
    public void draw(Pintable p) {
        for (NaveEnemiga cualquiera: malotes) {
            cualquiera.draw(p);
        }
    }

}
