package in.conceptarchitect.animals;

public class Dog extends Mammal implements  Hunter{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(type()+" is a flesh eater");
	
	}
	
	public void hunt() {
		System.out.println(type()+" hunts its prey");
	}

	
	public void guard() {
		System.out.println(type()+ " is excellent house guard");
	}
}
