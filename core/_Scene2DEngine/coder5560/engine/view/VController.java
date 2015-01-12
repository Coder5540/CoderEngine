package coder5560.engine.view;

import screens.AbstractGameScreen;
import screens.GameCore;
import utils.listener.OnComplete;
import coder5560.engine.Engine;
import coder5560.engine.view.test.ViewTest;

import com.badlogic.gdx.math.Rectangle;
import com.coder5560.game.enums.Constants;

public class VController extends Controller {

	public VController(GameCore _GameCore, Engine _Engine,
			AbstractGameScreen _Screen) {
		super(_GameCore, _Engine, _Screen);
	}

	@Override
	public IController buildController() {
		for(int i = 0; i< 1000; i++){
			
			ViewTest viewTest = new ViewTest(ViewName.TEST_VIEW, this,
					ViewName.DEFAULT, new Rectangle(0, 0, Constants.WIDTH_SCREEN,
							Constants.HEIGHT_SCREEN));
			addView(viewTest);	
		}
		
		
		ViewTest viewTest = new ViewTest(ViewName.TEST_VIEW, this,
				ViewName.DEFAULT, new Rectangle(0, 0, Constants.WIDTH_SCREEN,
						Constants.HEIGHT_SCREEN));
		addView(viewTest);
		viewTest.show(getEngine(), 1f, new OnComplete() {
			@Override
			public void onComplete(Object data) {
			}
		});
		
		return this;
	}

}
