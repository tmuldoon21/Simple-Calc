
public class SimpleCalc2 
{
	public static void main(String[] args)
	{
		SimpleCalculator myCalc = new SimpleCalculator();
		System.out.print(myCalc.add(3, 9));
		System.out.println(myCalc.subt(13,  22));
		System.out.println(myCalc.getCount());
		System.out.println(myCalc.mult(3,  5));
		myCalc.resetCount();
		System.out.println(myCalc.getCount());
	}
	
	
}