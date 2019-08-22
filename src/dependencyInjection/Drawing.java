/**
 * 
 */
package dependencyInjection;

/**
 * @author Bishwajit
 *
 */
public class Drawing {
	/**
	 *  Shape.
	 */
	private Shape shape;

	/**
	 * @return the shape.
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set.
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void drawingShape() {
		this.shape.draw();
	}

}
