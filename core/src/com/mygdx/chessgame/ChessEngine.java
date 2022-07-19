package com.mygdx.chessgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.w3c.dom.css.Rect;

import java.awt.*;

public class ChessEngine extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture texture;
	private Array<Array<Rectangle>> board;
	private int frameHeight, frameWidth;
	private int squareLength;
	private OrthographicCamera camera;

	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture("chess-board.jpg");

		frameHeight = Gdx.graphics.getHeight();
		frameWidth = Gdx.graphics.getWidth();

		camera = new OrthographicCamera();
		camera.setToOrtho(false, frameWidth, frameHeight);

		board = new Array<>();

		squareLength = frameHeight / 8;
//		for(int row = 0; row < 8; row++) {
//			board.add(new Array<Rectangle>());
//			for(int col = 0; col < 8; col++) {
//				Rectangle currSquare = new Rectangle();
//				currSquare.
//				board.add()
//			}
//		}
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ScreenUtils.clear(0, 0, 1, 1);

		camera.update();

		batch.begin();
		batch.draw(texture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}
}
