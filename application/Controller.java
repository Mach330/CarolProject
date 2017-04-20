
/**
* The controller controls the GameObject's translation, rotation and position. 
*/
interface GameObjectController {

	/**
	* What the GameObject does when it collides with another object
	*/
	public collided(){};

	/**
	* The things it has to do and check every game tick
	*/
	public tick(){};

	/**
	* Set the object it is to control
	*/
	public setObject(){};
	
}