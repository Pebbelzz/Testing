/**
 * Created by Josie on 8/6/2017.
 */

/*
Given an array of numbers, determine whether the sum of all of the numbers is odd or even.

Give your answer in string format as 'odd' or 'even'.

If the input array is empty consider it as: [0] (array with a zero).

 */
public class OddOrEven {

    public static String oddOrEven(int[] array){
        int sum = 0;
        for(int num:array){
            sum = num + sum;
        }
        System.out.println("---------------------");
        System.out.println("Sum is: " + sum);

        if((sum % 2 != 0) || (sum == 0 && array.length == 1)){
            System.out.println("odd");
            return "odd";
        }

        else{
            System.out.println("even");
            return "even";
        }
    }

    public static void main(String[] args){
        oddOrEven(new int[] {2, 5, 34, 6});
        oddOrEven(new int[] {0, -1, -5});
        oddOrEven(new int[] {0});
    }
}
