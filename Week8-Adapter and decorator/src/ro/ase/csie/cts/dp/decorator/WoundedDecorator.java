package ro.ase.csie.cts.dp.decorator;

public class WoundedDecorator extends AbstractDecorator {

	public WoundedDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject);
		
	}

	@Override
	public void move() {
		System.out.println("The hero is bearly moving because he's wounded");
		//super.move();
	}
	
	
}
