package com.vikram.bishwajit.setterInjection;

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
	private Point point;
	private List<Point> listPoint;
	private Map<String, Point> mapPoint;
	private Set<Point> setPoint;

	/**
	 * @return the typeOfTriangle
	 */
	public String getTypeOfTriangle() {
		return typeOfTriangle;
	}

	/**
	 * @param typeOfTriangle the typeOfTriangle to set
	 */
	public void setTypeOfTriangle(String typeOfTriangle) {
		this.typeOfTriangle = typeOfTriangle;
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
	 * @return the listPoint
	 */
	public List<Point> getListPoint() {
		return listPoint;
	}

	/**
	 * @param listPoint the listPoint to set
	 */
	public void setListPoint(List<Point> listPoint) {
		this.listPoint = listPoint;
	}

	/**
	 * @return the mapPoint
	 */
	public Map<String, Point> getMapPoint() {
		return mapPoint;
	}

	/**
	 * @param mapPoint the mapPoint to set
	 */
	public void setMapPoint(Map<String, Point> mapPoint) {
		this.mapPoint = mapPoint;
	}

	/**
	 * @return the setPoint
	 */
	public Set<Point> getSetPoint() {
		return setPoint;
	}

	/**
	 * @param setPoint the setPoint to set
	 */
	public void setSetPoint(Set<Point> setPoint) {
		this.setPoint = setPoint;
	}

	/**
	 * 
	 */
	public void draw() {
		// Setter Injection.
		System.out.println();
		System.out.println("Setter Injection");
		System.out.println(getTypeOfTriangle() + " - TRIANGLE");

		// Object Injection using Setter Injection.
		System.out.println();
		System.out.println("Object Injection using Setter Injection");
		System.out.println("Point(" + getPoint().getX() + " , " + getPoint().getY() + ")");

		// List Injection using Setter Injection.
		System.out.println("List Injection using Setter Injection");
		System.out.println("LIST SETTER INJECTION");
		for (Point p : listPoint)
			System.out.println("POINT(" + p.getX() + "," + p.getY() + ")");

		// Map Injection using Setter Injection.
		System.out.println();
		System.out.println("Map Injection Using Constructor Injection");
		for (Map.Entry<String, Point> map : getMapPoint().entrySet())
			System.out.println("Map{" + map.getKey() + "=" + "Point(" + map.getValue().getX() + ","
					+ map.getValue().getY() + ")}");

		// Set Injection using Setter Injection.
		System.out.println();
		System.out.println("Set Injection Using Constructor Injection");
		for (Point p : getSetPoint())
			System.out.println("Point(" + p.getX() + "," + p.getY() + ")");
	}
}
