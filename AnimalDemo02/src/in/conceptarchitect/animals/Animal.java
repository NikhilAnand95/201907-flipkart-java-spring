package in.conceptarchitect.animals;

public abstract  class Animal {

	public abstract void eat();

	public abstract void move();

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
