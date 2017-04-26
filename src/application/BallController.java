package application;

/**
* The specifics of the control of a Ball
*/
class BallController implements GameObjectController{
	
	GameObject _gameObject;
	
	/**
	* What happens when the ball collides
	* 	aka. the bouncing code
	*/
	@Override
	public void collided() {
		//make the ball bounce off the object (can be done with the point of 
		//contact on the ball, and the angle of the tangent of the 
		//surface it's bouncing off)
		
	}

	/**
	* Every tick
	* 	The ball moves
	*	Checks are made for collisions
	*		collision checks done in Game class?
	*/
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}


	/**
	* Sets the ball being controlled
	* several balls have one controller?
	*	several balls have another instance of the same controller
	*/
	@Override
	public void setObject() {
		// TODO Auto-generated method stub
		
	}
}