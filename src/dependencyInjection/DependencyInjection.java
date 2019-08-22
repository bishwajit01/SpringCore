package dependencyInjection;

/**
 * 
 * @author Bishwajit
 *
 */
public class DependencyInjection {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.setShape(new Triangle());
		drawing.drawingShape();
	}

}
