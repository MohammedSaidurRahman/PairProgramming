
public class HelloWorld {

	public static void main(String[] args) {
		int sum; 
		
		String i = "world";
		
		System.out.println("hello");
		
		System.out.println(i);
		
		System.out.println(helloWorld(i));
		
		System.out.println(retMethod());
		
		sum = sumMethod(16,0, false);
		System.out.println(sum);
		
		
		}
		
	
	
	public static String helloWorld(String i) {
	
		String k = "mcworldface";
		
		return i +" "+ k;
		
	}
	
	public static String retMethod() {
		 
	String j = "Hi";	
		
	return j;	
		
	}
	
	public static int sumMethod(int f, int g, boolean con) {
		
		 int sum;
		 
		if (con == true) {
			sum =  f + g;	
		}
		
		else if (g == 0 || f == 0) {
			
			for(sum =0; sum <= 10; sum++) {
				
			System.out.println(sum *(2+5));	
			
		}
		
		}
		else {
			sum = f * g;
		}
		return sum;

		
	}
	
	
	
	int[] testArray = {1,2,3,4,5,6,7,8,9,10};{
	
	for(int i = 0; testArray.length; i++) {
		int result = main.Check (i,10);
		System.out.println(result);
	
	}
	
}
}
