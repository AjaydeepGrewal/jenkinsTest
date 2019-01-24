package inheritance;

public class inheritanceTest {
	
	public inheritanceTest()
	{
		System.out.println("This is from class base class constructor.");
	}
	
	public void test()
	{
		System.out.println("This is from class base class.");
	}

	public static void main(String[] args) {
//		inheritanceTest baseClass;
//		baseClass = new derivedClass();
//		baseClass.test();
		
		//fibonacci
//		int fN = 0;
//		int sN = 1;
//		int tN ;
//		while(fN<100)
//		{
//			tN = fN + sN;
//			System.out.println(fN);
//			fN = sN;
//			sN = tN;
//		}
		
//		for(int i=0;i<=100;i++)
//		{
//			if(primeChecker(i))
//			{
//				System.out.println(i);
//			}
//		}
//	}
//	
//	static boolean primeChecker(int num)
//	{
//		for(int j=2;j<num;j++)
//		{
//			if(num%j==0)
//			{
//				return false;
//			}
//		}
//		return true;
//		String test ="abtrtba";
//		boolean pal = true;
//		int mid =(test.length()/2);
//		for(int i=0;i<mid;i++)
//		{
//			if(test.charAt(i) != test.charAt(test.length()-1-i))
//			{
//				pal=false;
//				System.out.println("Not Palindrome");
//				break;
//			}
//		}
//		if(pal)
//		{
//			System.out.println("A Palindrome");
//		}
		
//		int num = 110011;
//		int rev = 0;
//		int rem;
//		while(num!=0)
//		{
//			rem = num%10;
//			rev = rev*10 +rem;
//			num = num /10;
//		}
//		System.out.println(rev);
//		if(num == rev)
//		{
//			
//			System.out.println("Number is a palindrome");
//		}
//		else
//		{
//			System.out.println("Number is not a palindrome");
//		}
		
		int num = 9;
		System.out.println("Factorial: " + factorial(4));
	}
	static public int factorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
}
