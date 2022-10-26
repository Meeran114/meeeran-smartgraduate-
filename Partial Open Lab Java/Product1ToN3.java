
public class Product1ToN3 {
public static void main(String[] args) {
	long product=1;
	final int lowerbound=1;
	int upperbound=11;
	for(int n=lowerbound;n<=upperbound;++n)
	{
		product*=n;
	}
	System.out.println("The Product From"+lowerbound+" to "+upperbound+"="+product);
	
	upperbound=12;
	product=1;
	for(int n=lowerbound;n<=upperbound;++n)
	{
		product*=n;
	}
	System.out.println("The Product From"+lowerbound+" to "+upperbound+"="+product);
	upperbound=13;
	product=1;
	for(int n=lowerbound;n<=upperbound;++n)
	{
		product*=n;
	}
	System.out.println("The Product From"+lowerbound+" to "+upperbound+"="+product);
    upperbound=14;
    product=1;
	for(int n=lowerbound;n<=upperbound;++n)
	{
		product*=n;
	}
	System.out.println("The Product From"+lowerbound+" to "+upperbound+"="+product);

}
}
