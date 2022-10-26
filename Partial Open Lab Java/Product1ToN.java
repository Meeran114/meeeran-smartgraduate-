
public class Product1ToN {
public static void main(String[] args) {
	int product=1;
	final int lowerbound=1;
	final int upperbound=10;
	for(int n=lowerbound;n<=upperbound;++n)
	{
		product*=n;
	}
	System.out.println("The Product From"+lowerbound+" to "+upperbound+"="+product);
}
}
