

class GameObject extends Shape{

	//Needs a position, a translation, a rotation

	//use some kind of object to store X,Y,Z locations
	enum 2D{
		X(int), Y(int) }

	private 2D _position();
	private 2D _translation();
	private 2D _rotation();

	//Needs a controller
	private Controller controller;
	
	/**
	* To move the GameObject to the designated location
	*/	
	public void moveTo(int x, int y){
		_position.X = x;
		_position.Y = y;
	}
	
	/**
	* Moves the ball by it's stored translation
	*/
	public void move(){
		_position.X += _translation.X;
		_position.Y += _translation.Y;

		//rotate shape
	}

	public void accelerate(double multiplicator){
		_translation.X *= multiplicator;
		_translation.Y *= multiplicator;
	}
}