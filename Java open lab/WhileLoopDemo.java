import java.util.Scanner;

public class WhileLoopDemo {
public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	int number,sum=0,n;
	System.out.println("Plese Enter any number below 10");
	number=b.nextInt();
	n=number;
	while(number<=10)
	{
		sum+=number;
		number++;
	}
	System.out.println("The Sum of Number from "+n+" to 10 = "+sum);
}
}
