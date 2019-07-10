class PerComApp{
	public static void main(String [] args){		
		int n=5;
		int r=3;
		int p=Permutation.calculate(n,r);
		int c=Combination.calculate(n,r);
		System.out.println("permutation ="+p);
		System.out.println("combination ="+c);
	}
}

