package in.conceptarchitect.animals;

public   class Reptile extends Animal{

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
	
	public  void hunt() {
		System.out.println("Hunts some how");
	}

	

}
