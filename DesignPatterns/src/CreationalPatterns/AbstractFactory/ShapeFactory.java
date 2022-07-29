package CreationalPatterns.AbstractFactory;

public class ShapeFactory {
	
	//Somut fabrika siniflarinin turune gore Shape nesneleri uretilmesini saglar 
	 
	public static Shape getShape(ShapeAbstractFactory factory){
	    return factory.createShape();
	}
}
