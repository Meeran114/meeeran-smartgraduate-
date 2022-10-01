
public class DisplayPrimeNumbers {
public static void main(String[] args) {
	String primenumbers="";
	System.out.println("The Prime Numbers From 1 to 100 are : ");
	for(int i=2;i<=100;i++)
	{
		int counter=0;
		for(int num=2;num<=i;num++)
		{
			if(i%num==0)
			{
				counter+=1;
			}
		}
		if(counter==1)
		{
			System.out.println(i);
		}
	}
}
}
