package com.mygdx.chessgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.ScreenUtils;

public class ChessEngine extends ApplicationAdapter {
	SpriteBatch batch;
	Texture texture;
	TextureRegion mainBackground;
	float  stageHeight, stageWidth;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture("chess-board.jpg");
		mainBackground = new TextureRegion(texture,0, 0, 690, 690);
//		stageHeight = Gdx.graphics.getHeight();
//		stageWidth = Gdx.graphics.getWidth();

	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ScreenUtils.clear(0, 0, 1, 1);
		batch.begin();
		batch.draw(mainBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}
}
