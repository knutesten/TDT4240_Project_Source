package org.tdt4240.group20.sunstruck.input;

import com.badlogic.gdx.InputProcessor;

public class Input implements InputProcessor {

	@Override
	public boolean keyDown (int keycode) {
		System.out.println("KEYDOWN");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped (char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp (int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown (int x, int y, int pointer, int newParam) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged (int x, int y, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchMoved (int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp (int x, int y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

}