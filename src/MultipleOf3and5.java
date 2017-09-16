/**
 * Created by Josie on 9/16/2017.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

 Note: If the number is a multiple of both 3 and 5, only count it once.

 https://www.codewars.com/kata/multiples-of-3-and-5/train/java
 */
public class MultipleOf3and5 {

    private static int solution(int number){
        int num = number - 1;
        int sum = 0;
        System.out.println("Number is " + num);
        for(int i = num; i > 0; i--){
            System.out.println("i is: " + i);
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i + " is divisible by 3 or 5");
               sum = sum + i;
               System.out.println("Sum is now: " + sum);
            }

        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
