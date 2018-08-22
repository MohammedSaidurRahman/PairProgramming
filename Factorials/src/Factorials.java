import java.util.ArrayList;

public class Factorials {
	
	public static void main(String[] args)
	{
		int a = 479001600;
		int b = 1;
		
		for(int i = 1; i <100 ; i++)
		{
			b = b*i;					
			if (b==a)
			{
				System.out.println(i + "!");
				break;
				
			}else if (b>a)
			{
				System.out.print("None");
				break;
			}
		}
		

		
		int pup = 4;
		ArrayList<Integer> dog = new ArrayList<Integer>();
		
		for(int i = 1; i <101; i++)
		{	
			
			dog.add(i);
			
			
			
			if(i == pup)
			{
				continue;
			}
			else
			{
				if (i%10==1 && i !=11) {
					System.out.print(i +"st, ");
				}else if(i%10 == 2 && i != 12) {
					System.out.print(i+"nd, ");
				}else if(i%10==3 && i != 13) {
					System.out.print(i+"rd, ");
				}else if (i==100){
					System.out.print(i+ "th");
				}else {
					System.out.print(i + "th, ");
				}
			}			
		}
		dog.remove(pup-1);
		System.out.println(dog);
		
	}


}
	

