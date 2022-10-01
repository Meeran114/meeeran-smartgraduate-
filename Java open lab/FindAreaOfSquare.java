import java.util.Scanner;

public class FindAreaOfSquare {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the Length of the Square");
	double a=reader.nextDouble();
	double area=a*a;
	System.out.println("The Area Of Square = "+area);
}
}
