// To  find the highest mark and average mark secured by him in "s" number of subjects.

import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        // define size of array
        s = input.nextInt();
        // The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Initialize maximum element as first element of the array.
        // Traverse array elements to get the current max.
        // Store the highest mark in the variable result.
        // Store average mark in avgMarks.
        mark_avg=0;
        result = arr [0];
        for(i=0;i<s;i++){
            mark_avg+=arr[i];
            if(result<arr[i])
            result=arr[i];
        }
        mark_avg/=arr.length;
        System.out.println(result);
        System.out.print(mark_avg);
        input.close();
    }
}