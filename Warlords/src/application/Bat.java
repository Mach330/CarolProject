package application;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Bat extends SpriteBase{
	
	double _batMinX;
	double _batMaxX;
	
	double _speed;

	Input _input;
	
	public Bat(Pane layer, Image image, double x, double y, double r, double dx, double dy, double dr, double health,
			double damage, double speed, Input input) {
		super(layer, image, x, y, r, dx, dy, dr, health, damage);
		// TODO Auto-generated constructor stub
		
		_speed = speed;
		_input = input;
		
		init();
	}
	
	private void init(){
		
		_batMinX = 0;
		_batMaxX = Settings.SCENE_WIDTH - image.getWidth() / 2.0;
	}
	
	public void processInput(){
		//movement, only allowing side to side (for now)
		
		if(_input.isMoveLeft()) {
			dx = -_speed;
		} else if (_input.isMoveRight()) {
			dx = _speed;
		} else {
			dx = 0d;
		}
	}
	
	@Override
	public void move() {
		super.move();
		
		checkBounds();
	}
	
	private void checkBounds(){
		if( Double.compare(x, _batMinX) < 0) {
			x = _batMinX;
		} else if(Double.compare(x, _batMaxX) > 0) {
			x = _batMaxX;
		}
	}

	@Override
	public void checkRemovability() {
		// TODO Auto-generated method stub
		
	}

}
