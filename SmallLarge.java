import java.util.Scanner ;
class SmallLarge 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :") ;
		int a = sc.nextInt() ;

		System.out.println("Enter the second number :") ;
		int b = sc.nextInt() ;

		System.out.println("Enter the third number :") ;
		int d = sc.nextInt() ;

		System.out.println("Enter the fourth number :") ;
		int e = sc.nextInt() ;

		int c = (a > b ? a : b) > d ? (a > b ? a : b) : d ;
		System.out.println("The largest number is :" + c) ;
		
		int f = (a > b ? a : b) > (d > e ? d : e) ? (a > b ? a : b) : 
			(d > e ? d : e) ;
		System.out.println("The largest of four is :" + f) ;
	}
}
