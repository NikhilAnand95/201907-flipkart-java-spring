
class FactorialApp{

	public static void main(String [] args){
		
		int x=5;
		int fx= Math.factorial(x);

		System.out.println("Factorial of "+x+" is "+fx);
	}
}

class Math{

	static int factorial(int x){
		int fx=1;
		while (x>1)
			fx*=x--;
		return fx;
	}

public static void main(String [] args){
		System.out.println("Main from Math");		
	}
}

