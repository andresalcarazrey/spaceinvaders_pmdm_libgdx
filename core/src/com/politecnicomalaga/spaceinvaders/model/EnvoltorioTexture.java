package com.politecnicomalaga.spaceinvaders.model;

import com.badlogic.gdx.graphics.Texture;

public class EnvoltorioTexture implements Dibujable {

    protected Texture miTextura;

    public EnvoltorioTexture(Texture miTextura) {
        this.miTextura = miTextura;
    }

    @Override
    public int getWidth() {
        return miTextura.getWidth();
    }

    @Override
    public int getHeight() {
        return miTextura.getHeight();
    }




    @Override
    public Texture getTexture() {
        return miTextura;
    }
}
