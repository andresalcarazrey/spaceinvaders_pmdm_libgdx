package com.politecnicomalaga.spaceinvaders.model;

public class Nave extends ObjetoVolador{

    protected Dibujable explosion;
    protected boolean muerto;

    public Nave(float posX, float posY, float velX, float velY, Dibujable imagen, Dibujable explosion) {
        super(posX, posY, velX, velY, imagen);
        this.explosion = explosion;
        muerto = false;
    }

    public void morir() {
        muerto = true;
    }

    @Override
    public void draw(Pintable p) {
        if (muerto) {
            p.draw(explosion,posX-wdiv2,posY-hdiv2);

        } else super.draw(p);
    }


}
