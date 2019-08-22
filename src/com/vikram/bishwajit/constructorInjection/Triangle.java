package com.vikram.bishwajit.constructorInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Bishwajit.
 *
 */
public class Triangle {
	private String typeOfTriangle;
	private int height;
	private Point point;
	private List<Point> listPoint;
	private Map<String, Point> mapPoint;
	private Set<Point> setPoint;

	public Triangle(String type) {
		this.typeOfTriangle = type;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public Triangle(Point point) {
		this.point = point;
	}

	public Triangle(List<Point> listPoint) {
		this.listPoint = listPoint;
	}

	public Triangle(Map<String, Point> mapPoint) {
		this.mapPoint = mapPoint;
	}

	public Triangle(String t, int h, Point p, List<Point> lp, Map<String, Point> map, Set<Point> setPoint) {
		this.typeOfTriangle = t;
		this.height = h;
		this.point = p;
		this.listPoint = lp;
		this.mapPoint = map;
		this.setPoint = setPoint;
	}

	/**
	 * @return the typeOfTriangle
	 */
	public String getTypeOfTriangle() {
		return typeOfTriangle;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the point
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * @return the listPoint
	 */
	public List<Point> getListPoint() {
		return listPoint;
	}

	/**
	 * @return the mapPoint
	 */
	public Map<String, Point> getMapPoint() {
		return mapPoint;
	}

	/**
	 * @return the setPoint
	 */
	public Set<Point> getSetPoint() {
		return setPoint;
	}

	/**
	 * 
	 */
	public void draw() {
		// CI injection
		System.out.println("Constructor Injection");
		System.out.println(getTypeOfTriangle() + " - TRIANGLE of Height - " + getHeight());

		// Object Injection using CI injection
		System.out.println();
		System.out.println("Object Injection Using Constructor Injection");
		System.out.println("Point(" + getPoint().getX() + "," + getPoint().getY() + ")");

		// List Injection using CI injection.
		System.out.println();
		System.out.println("List Insertion Using Constructor Injection");
		for (Point p : getListPoint())
			System.out.println("Point(" + p.getX() + "," + p.getY() + ")");

		// Map Injection using CI injection.
		System.out.println();
		System.out.println("Map Injection Using Constructor Injection");
		for (Map.Entry<String, Point> map : getMapPoint().entrySet())
			System.out.println("Map{" + map.getKey() + "=" + "Point(" + map.getValue().getX() + ","
					+ map.getValue().getY() + ")}");
		
		// Set Injection using CI injection.
		System.out.println();
		System.out.println("Set Injection Using Constructor Injection");
		for (Point p : getSetPoint())
			System.out.println("Point(" + p.getX() + "," + p.getY() + ")");
	}
}
