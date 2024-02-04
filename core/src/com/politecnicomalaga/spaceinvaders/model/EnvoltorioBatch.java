package com.politecnicomalaga.spaceinvaders.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EnvoltorioBatch implements Pintable {

    protected SpriteBatch pantalla;

    public EnvoltorioBatch(SpriteBatch pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public void draw(Dibujable d,float x, float y) {
         this.pantalla.draw(d.getTexture(),x,y);
    }


}
