package in.conceptarchitect.utils;

public class Input{

	static java.util.Scanner scanner=new java.util.Scanner(System.in);
	public static String readString(String prompt){

		System.out.print(prompt);

		return scanner.next();
	}


	public static int readInt(String prompt){

		System.out.print(prompt);

		return scanner.nextInt();
	}

}