import java.util.Scanner;

public class FindAreaOfRectangle {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the Length of the Rectangle");
	double l=reader.nextDouble();
	System.out.println("Enter the Width of the Rectangle");
	double w=reader.nextDouble();
	double area=l*w;
	System.out.println("The Area Of Rectangle = "+area);
}
}
