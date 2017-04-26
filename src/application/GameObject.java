package application;

import javafx.scene.shape.Shape;

class GameObject extends Shape{

	//Needs a position, a rotation and a scale
	
	//Is a shape, therefore needs to have the methods in order
	//to be drawn by javafx

	//use some kind of object to store X,Y,Z locations
	
	/**
	 * moves the object relative to it's current location
	 * 
	 * @param dx the distance to move in the x direction
	 * @param dy the distance to move in the y direction
	 */
	public void move(int dx, int dy){
		//move shape
	}

	/**
	 * Moves the object to the location (x,y)
	 * 
	 * @param x the position to place in the x direction
	 * @param y the position to place in the y direction
	 */
	public void moveTo(int x, int y){
	}
	
	
	/**
	 * rotates the object by the given angle
	 * 360 degrees is a full circle rotation, all rotations are done relative to the 
	 * shape's current rotation
	 * 
	 * @param angle the angle through which to rotate the shape by 
	 * 	(positive for clockwise rotation, negative for anticlockwise)
	 */
	public void rotate(int angle){
		//rotate shape
	}
	
	/**
	 * changes the object's rotation to the given angle
	 * 	(360 is a full circle
	 * 
	 * @param angle the angle to rotate the object to
	 */
	public void rotateTo(int angle){
		
	}
	
	/**
	 * increases the size of the object multiplicatively 
	 * 
	 * @param xScale the scale change in the x direction
	 * @param yScale the scale change in the y direction
	 */
	public void scale(int xScale, int yScale){
		//scale shape
	}
	
	
	/**
	 * sets the size of the shape 
	 * 
	 * @param xScale the size in the x direction
	 * @param yScale the size in the y direction
	 */
	public void scaleTo(int xScale, int yScale){
		
	}

	@Override
	public com.sun.javafx.geom.Shape impl_configShape() {
		// TODO Auto-generated method stub
		return null;
	}
}