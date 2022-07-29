package CreationalPatterns.AbstractFactory;

public class CircleFactory implements ShapeAbstractFactory{
	@Override
	public Shape createShape() {
	    return new Circle();
	}
}
