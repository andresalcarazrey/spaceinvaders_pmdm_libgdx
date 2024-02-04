package com.politecnicomalaga.spaceinvaders.model;

import java.util.ArrayList;

public class Batallon {

    protected ArrayList<Escuadron> mogollon;

    public Batallon(int ancho, int alto, int offset, float velX, float velY, Dibujable imagen, Dibujable explosion, Dibujable iDisparo, int numNaves, int numEsc) {
        this.mogollon = new ArrayList<Escuadron>();
        int desplazamiento = (alto-offset)/(numEsc+1);
        int posY = desplazamiento;
        //Creamos los escuadrones
        for (int i =0;i<numEsc;i++) {
            Escuadron otro = new Escuadron(ancho,  alto - posY, velX, velY, imagen,  explosion,  iDisparo,  numNaves);
            mogollon.add(otro);
            posY += desplazamiento;
        }



    }


    //mover
    public void mover() {
        for (Escuadron cualquiera: mogollon) {
            cualquiera.mover();
        }
    }

    //pintar
    public void draw(Pintable p) {
        for (Escuadron cualquiera: mogollon) {
            cualquiera.draw(p);
        }
    }
}
