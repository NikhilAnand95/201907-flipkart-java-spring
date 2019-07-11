package in.conceptarchitect.animals;

@SpecialBehavior(name="humanSpeak")
public class Parrot extends Bird {

	@Override
	public void eat() {
		
		System.out.println(type()+" is a fruitarian");
	}

	@Speciality
	public void humanSpeak(){
		System.out.println(type()+" can speak in human voice");
	}

}
