/*To check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its 
digits for example 153 = 1^3+5^3+3^3, 370, 371, 407, etc. */

import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        // Use while loop check the number is Armstrong or not.
        // store the output(1 or 0) in result variable.
        int num=n,sum=0;
        while (num>0) 
        {sum+=(int) Math.pow((num%10),3);
            num/=10;
        }
        if(n==sum){
            result=1;
        }
        System.out.print(result);
        sc.close();
    }
}
