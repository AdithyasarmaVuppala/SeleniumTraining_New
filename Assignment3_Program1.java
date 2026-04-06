package Assignments;

public class Assignment3_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] elements = {200,12010, 20, 0 ,-3 ,4};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < elements.length; i++) {
		    if (elements[i] < smallest) {
		        secondSmallest = smallest;
		        smallest = elements[i];
		    } else if (elements[i] < secondSmallest) {
		        secondSmallest = elements[i];
		    }
		}
		System.out.println("Smallest digit is:" + smallest);
		System.out.println("Second Smallest digit is:" + secondSmallest);
		
	}
}

//
//Take an array of size 6
//Traverse and find smallest
//Traverse again to find second smallest
//Handle case when all elements are same