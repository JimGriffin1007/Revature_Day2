
public class Hello 
{
	public static void main(String[] args) 
	{
		byte x = 126; // 8 bits
		short y = 4643; // 16 bits
		
		y = x; // implicit
		x = (byte) y; // explicit 
		
		// EXPLICIT: low bit assigned to high bit
		// IMPLICIT: high bit assigned to low bit 
		
		//TYPE: byte short int long float double
		//BITS:  8    16    32  64   32     64    
		
		
		
		char w = '1';
		System.out.println(x);
		char z = 'a';
		System.out.println(y);
		boolean isValid = true;
		byte a = 127; // -128 -> +127  // 8 bits
		short b = (short)46476; // 16 bits
		int c = 76473674; // 32 bits
		
		long d = c; // 64 bits of memory space (implicit casting)
		
		int e = (int) d; //
		long f = d;
		
	int i = y;
	
	float r = 65.635f; // 32 bits
	double s = 7647586.56; // 64 bit
	
	String name = "Jim Griffin";
	}
}
