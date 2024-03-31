import java.util.Scanner ;
class If 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Are you paid?") ;
		
		boolean ans = sc.nextBoolean() ;
		if (ans == false)
		{
			System.out.println("Please pay fees.") ;
		}
		System.out.println("Thank you!") ;
	}
}
