package Demos.ExceptionHandling;

import java.util.Scanner;

public class AssertDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        try{
            assert b != 0 : "invalid input, will be a division problem";
            int res = a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
}