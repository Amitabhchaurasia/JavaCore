public class Ans3
{
	public static void main(String[] args) {
	
	    int num=1000;
		int sum=0;
		
		while(num>0){
		    if(num%7==0)
		    {
		        sum+=num;
		    }
		    num--;
		}
			System.out.println(sum);
	}
}