package Assignments;

public class Assignment_PrimeFactors {

	public static void main(String[] args) {
		 int n = 3146842;
		 int fact = 0;
		 for(int i = 2;i<n/2;i++)
		 {
			 if(n%i==0)
			 {
				 System.out.println(i);
				 fact++;
			 }
			 
			 while(n%i==0 && n!=0)
			 {
				 n = n/i;
			 }
		 }
		 if(fact==0)
			 System.out.println("It is a prime number hence no prime factors less than that number");
		
	}

}
