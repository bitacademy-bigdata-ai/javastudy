package paint;

public class Main {

	public static void main(String[] args) {
		Point pt1 = new Point(10, 50);
		//pt1.setX(10);
		//pt1.setY(50);
		//drawPoint(pt1);
		draw(pt1);
		//pt1.disappear();
		pt1.show(false);
		
		Point pt2 = new ColorPoint(100, 200, "red");
		// pt2.setX(100);
		// pt2.setY(200);
		// ((ColorPoint)pt2).setColor("red");
		// drawColorPoint(pt2);
		// drawPoint(pt2);
		draw(pt2);
		pt2.show(false);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		// drawShape(triangle);
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		// drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		// drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}

//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
	
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}

}
