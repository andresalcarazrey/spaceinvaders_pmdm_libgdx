package com.politecnicomalaga.spaceinvaders.model;

import java.util.ArrayList;

public class NaveEnemiga extends Nave {

    protected ArrayList<DisparoEnemigo> misDisparos;
    protected Dibujable disparo;

    public NaveEnemiga(float posX, float posY, float velX, float velY, Dibujable imagen, Dibujable explosion, Dibujable iDisparo) {
        super(posX, posY, velX, velY, imagen, explosion);
        misDisparos = new ArrayList<>();
        disparo = iDisparo;
    }

    public void disparar() {
        misDisparos.add(new DisparoEnemigo(this.posX,posY,-4f, this.disparo));
    }
}
