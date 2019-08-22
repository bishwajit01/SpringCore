/**
 * 
 */
package com.vikram.bishwajit.autowiringByName;

/**
 * @author Bishwajit.
 *
 */
public class Triangle {
	private Point pointsA;
	private Point pointsB;
	private Point pointsC;

	/**
	 * 
	 */
	public void draw() {
		// AUTOWIRING BY NAME
		System.out.println();
		System.out.println("Autowiring By Name");
		System.out.println("Point(" + getPointsA().getX() + "," + getPointsA().getY() + ")");
		System.out.println("Point(" + getPointsB().getX() + "," + getPointsB().getY() + ")");
		System.out.println("Point(" + getPointsC().getX() + "," + getPointsC().getY() + ")");
	}

	/**
	 * @return the pointsA
	 */
	public Point getPointsA() {
		return pointsA;
	}

	/**
	 * @param pointsA the pointsA to set
	 */
	public void setPointsA(Point pointsA) {
		this.pointsA = pointsA;
	}

	/**
	 * @return the pointsB
	 */
	public Point getPointsB() {
		return pointsB;
	}

	/**
	 * @param pointsB the pointsB to set
	 */
	public void setPointsB(Point pointsB) {
		this.pointsB = pointsB;
	}

	/**
	 * @return the pointsC
	 */
	public Point getPointsC() {
		return pointsC;
	}

	/**
	 * @param pointsC the pointsC to set
	 */
	public void setPointsC(Point pointsC) {
		this.pointsC = pointsC;
	}

}
