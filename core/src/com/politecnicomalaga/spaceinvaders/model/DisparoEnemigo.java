package com.politecnicomalaga.spaceinvaders.model;

public class DisparoEnemigo extends Disparo {
    public DisparoEnemigo(float posX, float posY, float velY, Dibujable imagen) {
        super(posX, posY, -velY, imagen);
    }
}
