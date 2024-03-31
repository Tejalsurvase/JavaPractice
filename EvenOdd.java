import java.util.Scanner ;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :") ;
		int n1 = sc.nextInt() ;
		
		if ((n1 / 2 * 2) == n1)
		{
			System.out.println(n1 + "is even number.") ;
		}
		System.out.println("It is odd num.") ;
	}
}
