package com.politecnicomalaga.spaceinvaders.model;

import java.util.ArrayList;

public class NaveAmiga extends Nave {

    protected ArrayList<DisparoAmigo> misDisparos;

    public NaveAmiga(float posX, float posY, float velX, float velY, Dibujable imagen, Dibujable explosion) {
        super(posX, posY, velX, velY, imagen, explosion);
        misDisparos = new ArrayList<>();
    }
}
