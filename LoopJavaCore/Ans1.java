public class Ans1
{
	public static void main(String[] args) {
	
	int lowerbound=9;
	int upperbound=899;
		int sum=0;
		
		while(upperbound>=lowerbound){
		    sum+=upperbound;
		    upperbound--;
		}
			System.out.println(sum);
	}
}