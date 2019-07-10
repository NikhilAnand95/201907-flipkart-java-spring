package in.conceptarchitect.calculations;

public class Factorial{
	public static int factorial(int x){
		int fx=1;
		while (x>1)
			fx*=x--;
		return fx;
	}
}
