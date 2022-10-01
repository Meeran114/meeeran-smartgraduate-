import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	int num,rev=0;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a Number to Reverse:");
	num=in.nextInt();
	int n=num;
	while(num!=0)
	{
		rev=(rev*10)+(num%10);
		num/=10;
	}
	System.out.println("The Revrse of "+n+" is "+rev);
}
}
