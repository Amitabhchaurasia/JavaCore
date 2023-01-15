/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ans8
{
	public static void main(String[] args) {
		
		int num=1000;
		int sum=0;
		while(num>0){
		    if(num%3==0 || num%5==0 || num%7==0){
		        if( num%15!=0 || num%21!=0 || num%35!=0 || num%105!=0)
		        sum+=num;
		    }
		    num--;
		}
		System.out.println(sum);
	}
}

