
public class Ans9
{
	public static void main(String[] args) {
	    int year=2010;
	    int count=0;
	    while(year>999){
	        if((year%4==0 && year%100!=0 )|| (year%400==0)){
	            count++;
	            
	        }
	        year--;
	    }
	    
		System.out.println("No of leap year "+count);
	}
}
