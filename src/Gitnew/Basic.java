package Gitnew;

public class Basic {

	public static void main(String[] args) {
		int num=12456789;
		int count=0;
		
		while(num>0) {
			count++;
			num/=10;	
			
		}
		System.out.println("Number of digits in the given count is: "+count);


	}

}
