package imp.view;

import utils.listener.OnCompleteListener;
import coder5560.engine.list.ListVertical;
import coder5560.engine.list.ScrollView;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.coder5560.game.assets.Assets;
import com.coder5560.game.views.IViewController;
import com.coder5560.game.views.View;

public class ListViewTest extends View {
//	ScrollView	scrollView;
	ListVertical	listVertical;

	@Override
	public void build(Stage stage, IViewController viewController,
			String viewName, Rectangle bound) {
		super.build(stage, viewController, viewName, bound);
	}

//	public void buildComponent() {
//		setBackground(new NinePatchDrawable(new NinePatch(
//				Assets.instance.ui.reg_ninepatch, Color.BLACK)));
//		scrollView = new ScrollView(getWidth() / 2, getHeight() / 2);
//		scrollView.setPosition(getWidth() / 2, getHeight() / 2, Align.center);
//		addActor(scrollView);
//	}
	public void buildComponent() {
		setBackground(new NinePatchDrawable(new NinePatch(
				Assets.instance.ui.reg_ninepatch, Color.BLACK)));
		listVertical = new ListVertical(getWidth() / 2, getHeight() / 2);
		listVertical.setPosition(getWidth() / 2, getHeight() / 2, Align.center);
		addActor(listVertical);
	}

	@Override
	public void show(OnCompleteListener listener) {
		super.show(listener);
	}

	@Override
	public void hide(OnCompleteListener listener) {
		super.hide(listener);
	}

	@Override
	public void destroyComponent() {
		super.destroyComponent();
	}

	@Override
	public void back() {
		super.back();
	}

}
