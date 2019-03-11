
public class Demo2
{
	public static void main(String[] args) 
	{

		int x = 65;
		
		System.out.println("print x: " + x);
		System.out.println("impliment post-inc: " + x++); // post-increment 
		System.out.println("after post-inc: " + x);
		
		System.out.println("implement post-inc: " + ++x); // pre-increment
		
		x += 5; // x = x+5
		
		if(x<60 && x++>61)
		{
			System.out.println(x);
		}
		
		int a = 5;
		int b = a>7? a:10; // ternary operator
		System.out.println(b);
		
		
	}
}
