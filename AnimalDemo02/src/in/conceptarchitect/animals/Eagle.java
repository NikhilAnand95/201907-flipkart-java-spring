package in.conceptarchitect.animals;

public class Eagle extends Bird implements  Hunter{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(type()+" is flesh eater");
	}

	
	public void hunt() {
		System.out.println(type()+ "is a flying hunter");
	}

}
