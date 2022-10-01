import java.util.Scanner;

public class FloydsTriangle {
public static void main(String[] args) {
	int rows,counter=1,number=1;
	Scanner b=new Scanner(System.in);
	System.out.println("Enter the No of rows for Floyds Triangle");
	rows=b.nextInt();
	System.out.println("************************");
	for (counter=1;counter<=rows;counter++)
	{
		for (int j=1;j<=counter;j++)
		{
			System.out.print(number+" ");
		}
		number++;
		System.out.println();
	}
}
}
