package application;


/**
* The controller controls the GameObject's translation, rotation and position. 
*/
public interface GameObjectController {
	//holds the rate of rotation, translation and scaling for it's gameobject
	
	/**
	* What the GameObject does when it collides with another object
	*/
	public void collided();

	/**
	* The things it has to do and check every game tick
	*/
	public void tick();

	/**
	* Set the object it is to control
	*/
	public void setObject();

}
