
public class factorial 
{
	int result = 1;
	int findFactorial (int number) 
	{
		result = result * number;
		number--;
		
		if (number>1) 
		{
			findFatorial(number);
			return result;
		}
	}
	
	public static void main(String[] args) 
	{
		
	}
}
