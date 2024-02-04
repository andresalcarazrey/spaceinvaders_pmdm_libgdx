package com.politecnicomalaga.spaceinvaders.model;

public class Disparo  extends ObjetoVolador {
    public Disparo(float posX, float posY, float velY, Dibujable imagen) {
        super(posX, posY, 0f, velY, imagen);
    }
}
