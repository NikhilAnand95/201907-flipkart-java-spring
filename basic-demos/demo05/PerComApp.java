
//import calculation.*


import calculations.Permutation;
import calculations.Combination;



class PerComApp{
	public static void main(String [] args){		
		int n=utils.Input.readInt("n? ");
		int r=utils.Input.readInt("r? ");

		int p=Permutation.calculate(n,r);
		int c=Combination.calculate(n,r);
		System.out.println("permutation ="+p);
		System.out.println("combination ="+c);
	}
}

