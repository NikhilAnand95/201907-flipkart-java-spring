package in.conceptarchitect.animals;

@SpecialBehavior(name="move")
public  abstract class Reptile extends Animal implements  Hunter{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(type()+" are flesh eater");
	}

	@Override

	public void move() {
		// TODO Auto-generated method stub
		System.out.println(type()+ " crawls");
		
	}
	
	public abstract void hunt();
	

}
