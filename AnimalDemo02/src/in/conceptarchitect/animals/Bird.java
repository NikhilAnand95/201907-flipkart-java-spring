package in.conceptarchitect.animals;

public abstract class Bird extends Animal {


	public void move() {		
		fly();
	}
	@Speciality
	public void fly() {
		System.out.println(type()+" flies in sky");
	}

}
