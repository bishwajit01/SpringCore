package com.vikram.bishwajit.autowiringByType;

/**
 * 
 * @author Bishwajit.
 *
 */
public class Triangle {
	private String names;
	private int sides;
	private String type;
	private Point point;
	private Point point1;

	public void draw() {
		// Auto Wiring By Type.
		System.out.println();
		System.out.println("AUTOWIRING By TYPE");
		System.out.println("Name of the Traingle :: " + getNames());
		System.out.println("Name of the Traingle :: " + getType());
		System.out.println("Side of the Traingle :: " + getSides());
		System.out.println("Point(" + getPoint().getX() + "," + getPoint().getY() + ")");
	}

	/**
	 * @return the names
	 */
	public String getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.names = names;
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	/**
	 * @return the point
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(Point point) {
		this.point = point;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
