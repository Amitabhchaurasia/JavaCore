/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ans6
{
	public static void main(String[] args) {
	    int num=1000;
    int even=0;
    int odd=0;
    
	    while(num>0)
	    {
	        if(num%2==0)
	        {
	            even+=num;
	        }
	        else{
	            odd+=num;
	        }
	        num--;
	    }
	    int diff=even-odd;
		System.out.println("Even="+even);
		System.out.println("Odd="+odd);
		System.out.println("Difference b/w sum of even & odd "+diff);
		
	}
}
