class Permutation{

	static int calculate(int n,int r){
		return Math.factorial(n)/Math.factorial(n-r);
	}
}