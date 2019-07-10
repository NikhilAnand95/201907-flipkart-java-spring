
class FactorialApp{

	public static void main(String [] args){
		
		int x=5;
		int fx= factorial(x);

		System.out.println("Factorial of "+x+" is "+fx);
	}

	static int factorial(int x){
		int fx=1;
		while (x>1)
			fx*=x--;
		return fx;
	}
}

