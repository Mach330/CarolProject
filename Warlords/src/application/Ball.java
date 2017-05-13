package application;

import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Ball extends SpriteBase{
	
	double _ballMinX;
	double _ballMaxX;
	double _ballMinY;
	double _ballMaxY;
	
	double _speed;
	double _xSpeed;
	double _ySpeed;

	public Ball(Pane layer, Image image, double x, double y, double r, double dx, double dy, double dr, double health,
			double damage, double speed) {
		super(layer, image, x, y, r, dx, dy, dr, health, damage);
		
		_speed = speed;
		
		init();
	}
	
	//set settings that will be used later on.
	private void init(){
		_ballMinX = 0;
		_ballMinY = 0;
		_ballMaxX = Settings.SCENE_WIDTH - image.getWidth();
		_ballMaxY = Settings.SCENE_HEIGHT - image.getHeight();
	
		//the random direction with the speed.
		Random randomCalc = new Random();
		double random = randomCalc.nextDouble();
		double Xresult = random + 0.01;
		random = randomCalc.nextDouble();
		double Yresult = random + 0.01;
		
		_ySpeed = Math.sqrt(Math.pow(_speed, 2) / (Math.pow(Xresult/Yresult,2) + 1));
		_xSpeed = Math.sqrt(Math.pow(_speed, 2) - Math.pow(_ySpeed, 2));
		
		dx = randomCalc.nextDouble() > 0.5 ? _xSpeed : -_xSpeed;
		dy = randomCalc.nextDouble() > 0.5 ? _ySpeed : -_ySpeed;
	}
	
	@Override
	public void move(){
		super.move();
		
		checkBounds();
	}
	
	private void checkBounds(){
		
		// vertical
		if( Double.compare( y, _ballMinY) < 0) {
			y = _ballMinY;
			dy = _ySpeed;
		} else if(Double.compare(y, _ballMaxY) > 0){
			y = _ballMaxY;
			dy = -_ySpeed;
		}
		
		//horizontal 
		if(Double.compare( x, _ballMinX) < 0){
			x = _ballMinX;
			dx = _xSpeed;
		} else if (Double.compare(x, _ballMaxX) > 0){
			x = _ballMaxX;
			dx = -_xSpeed;
		}
	}

	@Override
	public void checkRemovability() {
		// TODO Auto-generated method stub
		
	}

}
