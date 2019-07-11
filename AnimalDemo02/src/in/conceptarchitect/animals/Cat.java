package in.conceptarchitect.animals;

public abstract class Cat extends Mammal implements  Hunter{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		hunt();
		System.out.println(type()+" is a flesh eater");
	
	}
	@Speciality
	public void hunt() {
		System.out.println(type()+" hunts its prey");
	}

}
