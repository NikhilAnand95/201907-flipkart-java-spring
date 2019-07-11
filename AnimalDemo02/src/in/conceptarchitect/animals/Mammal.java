package in.conceptarchitect.animals;

public abstract class Mammal extends Animal{

	@Override
	public void move() {
		System.out.println(type()+"moves on land");
	}
}
