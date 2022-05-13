package weekendAssessment;

public class forloopw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		boolean isprime = true;
		for(int i = 2; i<number/2;i++)
		{
			if (number % i == 0)
			{
				isprime = false;
			}
			}
		     if(isprime==true)
		     {
		    	System.out.println("the number is prime number "); 
		     }
		     else 
		     {
		    	 System.out.println("the number is not prime number");
		     }
	}

}
