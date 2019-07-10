package in.conceptarchitect.calculations;



public class Permutation{

	public static int calculate(int n,int r){
		return Factorial.factorial(n)/Factorial.factorial(n-r);
	}
}