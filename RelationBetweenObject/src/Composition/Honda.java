package Composition;

public class Honda extends Car {
	public void HondaStart() {
		CarEngine Honda_Engine = new CarEngine(); // composition 
		Honda_Engine.startEngine();
	}
}
