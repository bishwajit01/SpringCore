package com.vikram.bishwajit.beanProperties;

/**
 * 
 * @author Bishwajit.
 *
 */
public class Triangle {
	private Point pointA;

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	/**
	* 
	*/
	public void draw() {
		System.out.println("\nInner Bean Example");
		System.out.println("Point(" + getPointA().getX() + "," + getPointA().getY() + ")");
	}
}
