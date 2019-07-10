package calculations;

import calculations.Factorial;

public class Combination{

	public static int calculate(int n,int r){
		return Factorial.factorial(n)/
			Factorial.factorial(n-r)/
			Factorial.factorial(r);
	}
}