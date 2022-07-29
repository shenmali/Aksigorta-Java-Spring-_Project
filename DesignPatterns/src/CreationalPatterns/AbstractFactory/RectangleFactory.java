package CreationalPatterns.AbstractFactory;

public class RectangleFactory implements ShapeAbstractFactory{
	@Override
	public Shape createShape() {
	    return new Rectangle();
	}

}
