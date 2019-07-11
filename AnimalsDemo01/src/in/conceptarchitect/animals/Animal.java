package in.conceptarchitect.animals;

public  class Animal {

	public  void eat(){
		System.out.println("Eats something!!!");
	}
	public  void move(){
		System.out.println("Moves somehow!!!");
	}
	
	public void sleep(int time) {
		try {
			System.out.println(type()+"sleeping for "+time+" ms");
			Thread.sleep(time);
		}
		catch(InterruptedException ex) {
			
		}
		System.out.println(type()+" wakes");
	}
	
	public void quickSleep() {
		sleep(2000);
	}
	
	public String type() {
		return ""+this.getClass().getSimpleName();
	}
	
}
