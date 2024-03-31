import java.util.* ;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the string :");
		String s = sc.nextLine() ;
		String s1 = "";
		char ch ;
		for(int i = 0; i < s.length(); i++)
		{
			ch = s.charAt(i) ;
			s1 = ch + s1 ;
		}
		System.out.println(s1) ;
	}
}
