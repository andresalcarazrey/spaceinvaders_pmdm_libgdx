package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.politecnicomalaga.spaceinvaders.model.Batallon;
import com.politecnicomalaga.spaceinvaders.model.EnvoltorioBatch;
import com.politecnicomalaga.spaceinvaders.model.EnvoltorioTexture;
import com.politecnicomalaga.spaceinvaders.model.NaveAmiga;
import com.politecnicomalaga.spaceinvaders.model.Pintable;


public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture naveAliada;
	Texture naveEnemiga;
	Texture disparoA;
	Texture disparoE;
	Texture explosion;

	NaveAmiga luke;

	Batallon empire;

	Pintable pantalla;


	int x,y;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		naveAliada = new Texture("player_1.png");

		naveEnemiga = new Texture("enemigo.png");
		disparoA = new Texture("disparo_aliado.png");
		disparoE = new Texture("disparo_enemigo.png");
		explosion = new Texture("explosion.png");

		luke = new NaveAmiga(Gdx.graphics.getWidth()/2,50,0f,0f,new EnvoltorioTexture(naveAliada),new EnvoltorioTexture(explosion));
        empire = new Batallon(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),Gdx.graphics.getHeight()/2,0f,0f,new EnvoltorioTexture(naveEnemiga),new EnvoltorioTexture(explosion),new EnvoltorioTexture(disparoE),6,4);
		pantalla = new EnvoltorioBatch(batch);


	}

	@Override
	public void render () {


		//Recoger entrada
		if (Gdx.input.justTouched()) {
			int x= Gdx.input.getX();
			int y= Gdx.input.getY();

			if (x<Gdx.graphics.getWidth()/2) luke.setVelX(-2f);
			else luke.setVelX(2f);
		}


		//simular el mundo
		luke.moverse();


        //Pintar el mundo
		ScreenUtils.clear(0f,0f,0f,1);
		batch.begin();

        luke.draw(pantalla);
		empire.draw(pantalla);

		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		naveAliada.dispose();

		naveEnemiga.dispose();
		disparoA.dispose();
		disparoE.dispose();
		explosion.dispose();

	}
}
