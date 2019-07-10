package in.conceptarchitect.app;

import in.conceptarchitect.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle t = new Triangle(3,4,6);


        int p= t.perimeter();

        System.out.println(p);

        System.out.println(t.getS1());
        System.out.println(t.getS2());
        System.out.println(t.getS3());


    }
}
