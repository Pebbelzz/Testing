/**
 * Created by Josie on 7/19/2017.
 */

/*
Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".
 */


public class ArithmeticFunction {

    public static int arithmetic ( int a, int b,  String operator){
        int result = 0;
        if(operator.equals("add")){
            result = a + b;
        }
        else if(operator.equals("subtract")){
            result = a - b;
        }
        else if(operator.equals("multiply")){
            result =  a * b;
        }
        else if(operator.equals("divide")){
            result =  a / b;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String args[]){
        arithmetic(1, 2, "add");
        arithmetic(8, 2, "subtract");
        arithmetic(5, 2, "multiply");
        arithmetic(8, 2, "divide");
    }
}
