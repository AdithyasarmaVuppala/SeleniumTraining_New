package Assignments;

public class Assignment3_Program2 {

	static boolean isSorted(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					return false;
			}
	}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,2,7};

// Check and display result
if (isSorted(arr)) {
    System.out.println("true");
} else {
    System.out.println("false");
}


	}

}






//Input array
//Create method isSorted()
//Check ascending order
//Return true/false

