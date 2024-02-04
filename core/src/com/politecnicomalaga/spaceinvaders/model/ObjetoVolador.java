package com.politecnicomalaga.spaceinvaders.model;

public class ObjetoVolador {
    protected float posX;
    protected float posY;
    protected float velX;
    protected float velY;

    protected float wdiv2;
    protected float hdiv2;
    protected Dibujable imagen;

    public ObjetoVolador(float posX, float posY, float velX, float velY, Dibujable imagen) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.imagen = imagen;
        wdiv2 = imagen.getWidth()/2;
        hdiv2 = imagen.getHeight()/2;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public Dibujable getImagen() {
        return imagen;
    }

    public void setImagen(Dibujable imagen) {
        this.imagen = imagen;
    }

    public void draw(Pintable p) {
        p.draw(imagen,posX-wdiv2,posY-hdiv2);
    }

    public void moverse() {
        posX += velX;
        posY += velY;
    }

    public boolean colisiona(ObjetoVolador otro) {

        return (Math.abs(posX - otro.getPosX()) <= (wdiv2 + otro.getWdiv2())) && (Math.abs(posY - otro.getPosY()) <= (hdiv2 + otro.getHdiv2()));

    }

    private boolean colisionaVertical(ObjetoVolador otro) {
        if ((this.posX > otro.getPosX() && this.posX < otro.getPosX()+otro.getWidth()) ||
        (this.posX+this.getWidth() > otro.getPosX() && this.posX+this.getWidth() < otro.getPosX()+otro.getWidth())) return true;
        return false;

    }


    private boolean colisionaHorizontal(ObjetoVolador otro) {
        if ((this.posY > otro.getPosY() && this.posY < otro.getPosY()+otro.getHeight()) ||
        (this.posY+this.getHeight() > otro.getPosY() && this.posY+this.getHeight() < otro.getPosY()+otro.getHeight())) return true;
        return false;

    }

    public int getWidth() {
        return imagen.getWidth();
    }

    public int getHeight() {
        return imagen.getHeight();
    }

    public float getWdiv2() {
        return wdiv2;
    }

    public float getHdiv2() {
        return hdiv2;
    }


}


