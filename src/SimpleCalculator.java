
public class SimpleCalculator
{
	private int numCalcs = 0;
	
	public int add(int num1, int num2)
	{
		int sum = num1 + num2;
		numCalcs++;
		return sum
		
	}
	
	public int subt(int num1, int num2)
	{
		numCalcs++;
		return num1 - num2;
	}
	
	public int mult(int num1, int num2)
	{
		numCalcs++;
		return num1 * num2;
	}
	
	public int getCount()
	{
		return numCalcs;
	}
	
	public void resetCount()
	{
		numCalcs = 0;
	}
	
}
