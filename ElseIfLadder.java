import java.util.Scanner ;
class ElseIfLadder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter first number :") ;
		int num1 = sc.nextInt() ;
		
		if (num1 >= 0 && num1 <= 100)
		{
			if (num1 >= 35 && num1 <= 60)
		    {
			    System.out.println("Pass") ;
		    }
		    else if (num1 >= 61 && num1 <= 80)
		    {
			    System.out.println("Second class") ;
		    }
		    else if (num1 >= 81 && num1 <= 100)
		    {
			    System.out.println("First class") ;
		    }
		    else
		    {
			    System.out.println("Fail") ;
		    }
		}
		else
		{
			System.out.println("Enter valid marks") ;
		}
	}
}
