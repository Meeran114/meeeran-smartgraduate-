import java.util.Scanner;

public class ArrayInput {
public static void main(String[] args) {
	int[] array=new int[10];
	int sum=0;
	Scanner b=new Scanner(System.in);
	System.out.println("Enter The Elements:");
	for(int i=0;i<10;i++)
	{
		array[i]=b.nextInt();
		sum+=array[i];
	}
	System.out.println("The Sum of Array Elements = "+sum);
}
}
