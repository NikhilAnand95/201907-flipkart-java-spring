package in.conceptarchitect.animals;


public class Cat extends Mammal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(type()+" is a flesh eater");
	
	}
	
	public void hunt() {
		System.out.println(type()+" hunts its prey");
	}

}
