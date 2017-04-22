package ru.znay.znay;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LD38 extends ApplicationAdapter {
	SpriteBatch batch;
	
	public void create () {
		batch = Reg.i.add(new SpriteBatch());
	}

	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	public void dispose () {
		Reg.i.dispose();
	}
}
