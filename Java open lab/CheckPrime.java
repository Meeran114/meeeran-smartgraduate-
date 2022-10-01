import java.util.Scanner;

public class CheckPrime {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	int num,counter=0;
	System.out.print("Enter a Number:");
	num=reader.nextInt();
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
			counter+=1;
	}
	if (counter==1)
		System.out.println(num+" is a Prime Number");
	else
		System.out.println(num+" is not a Prime Number");
}
}
