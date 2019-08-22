package com.vikram.bishwajit.autowiringByConstructor;

/**
 * 
 * @author Bishwajit.
 *
 */
public class Triangle {
	private String name;
	private int side;
	private Point point;

	/**
	 * @param name  Name.
	 * @param side  Side.
	 * @param point Point.
	 */
	public Triangle(String name, int side, Point point) {
		super();
		this.name = name;
		this.side = side;
		this.point = point;
	}

	/**
	 * 
	 */
	public void draw() {
		// AUTO WIRING by Constructor
		System.out.println();
		System.out.println("AUTOWIRING By CONSTRUCTOR");
		System.out.println("Name of the Traingle :: " + getName());
		System.out.println("Side of the Traingle :: " + getSide());
		System.out.println("Point(" + getPoint().getX() + "," + getPoint().getY() + ")");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @return the point
	 */
	public Point getPoint() {
		return point;
	}

}
