/**
 * Created by Josie on 7/18/2017.
 */
public class FindOddCubes {


    public static int cubeOdd(int arr[]) {

        //Good luck!
        for( int i = 0; i < arr.length; i++ ){
            System.out.println("i currently is " + i + " and num is " + arr[i] + " before cubing");
            arr[i] = arr[i] * arr[i] * arr[i];
            System.out.println("num after cubing is: " + arr[i]);
        }

        int sum = 0;
        for(int num : arr ){
            System.out.println("in the for loop and num is: " + num);
            System.out.println("num % 2 is: " + num%2);
            if(num % 2 == 1 || num % 2 == -1){
                System.out.println("num " + num + "tested true for being odd");
                System.out.println("sum is currently " + sum);
                System.out.println("adding num " + num + "to sum...");
                sum = sum + num;
                System.out.println("sum is now: " + sum);
            }

        }
        System.out.println("sum at the end equals " + sum);
        return sum;
    }

    public static void main(String args[]){
        cubeOdd(new int[] {-5, -5, 5, 5});
        cubeOdd(new int[] {1, 2, 3, 4});
        cubeOdd(new int[] {-3, -2, 2, 3});
    }
}
