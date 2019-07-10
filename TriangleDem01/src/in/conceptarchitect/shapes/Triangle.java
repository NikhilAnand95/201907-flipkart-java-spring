package in.conceptarchitect.shapes;

public class Triangle {

    private int s1,s2,s3;

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int perimeter(){
        return s1+s2+s3;
    }

    public double area(){
        return 0;
    }

    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }
}
