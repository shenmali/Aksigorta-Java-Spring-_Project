package CreationalPatterns.AbstractFactory;

public class TestFactory {

	public static void main(String[] args) {
		Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
	    ((Rectangle) rectangle).setWidth(13);
	    ((Rectangle) rectangle).setHeight(5);
	 
	    Shape circle = ShapeFactory.getShape(new CircleFactory());
	    ((Circle) circle).setRadius(4);
	 
	    System.out.println("Dikdortgenin alani : "+rectangle.getArea()+" ve cevresi: "+rectangle.getSize());
	    System.out.println("Dairenin alani: "+circle.getArea()+" ve cevresi: "+circle.getSize());

	}

}
