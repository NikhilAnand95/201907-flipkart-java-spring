
//import calculation.*


import in.conceptarchitect.calculations.Permutation;
import in.conceptarchitect.calculations.Combination;



class PerComApp{
	public static void main(String [] args){		
		int n=in.conceptarchitect.utils.Input.readInt("n? ");
		int r=in.conceptarchitect.utils.Input.readInt("r? ");

		int p=Permutation.calculate(n,r);
		int c=Combination.calculate(n,r);
		System.out.println("permutation ="+p);
		System.out.println("combination ="+c);
	}
}

