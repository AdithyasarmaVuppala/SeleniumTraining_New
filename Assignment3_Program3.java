package Assignments;

public class Assignment3_Program3 {


    // Method to move all zeros to the end
    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {


        int[] arr = {1, 0, 0 ,22, 34, 0, -1};
        System.out.println("Array before moving zeros to end:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Array after moving zeros to end:");

        moveZerosToEnd(arr);           

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
    }
}





//🔹 Q3. Move All Zeros to End
//
//👉 Steps:
//
//Input array
//Move all 0s to end without changing order of others
//Do it in-place (no extra array)
//
//👉 Example:
//[1, 0, 3, 0, 5] → [1, 3, 5, 0, 0]