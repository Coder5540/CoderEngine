package com.coder5560.game.screens;

import screens.AbstractGameScreen;
import screens.GameCore;
import utils.factory.StringSystem;
import coder5560.engine.view.Controller;
import coder5560.engine.view.VController;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.coder5560.game.enums.ViewState;
import com.coder5560.game.views.TraceView;

public class TestScreen extends AbstractGameScreen {
	Controller	controller;

	public TestScreen(GameCore game) {
		super(game);
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height, true);
	}

	@Override
	public void show() {
		super.show();
		controller = new VController(parent, getEngine(), this);
		controller.buildController();
	}

	@Override
	public void update(float delta) {

	}

	@Override
	public void render(float delta) {
		super.render(delta);
	}

	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.BACK || keycode == Keys.ESCAPE) {
			if (controller.getCurrentView() != null)
				controller.getCurrentView().back();
		}
		return false;
	}

}
