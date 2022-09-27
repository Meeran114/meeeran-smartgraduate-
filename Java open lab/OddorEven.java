import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=b.nextInt();
		if(num%2==0)
		{
			System.out.println("The Given Number is Even");
		}
		else
		{
			System.out.println("The Given Number is Odd");
		}
	}

}
