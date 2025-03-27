package Demos.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        try{
//            int a = scn.nextInt();
//            int b = scn.nextInt();
//            int div = a / b;
//            System.out.println(div);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println("division by zero error");
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//            System.out.println("Inp is incorrect");
//        }

//        Scanner scn = new Scanner(System.in);
//        try{
//            int a = scn.nextInt();
//            int b = scn.nextInt();
//            int div = a / b;
//            System.out.println(div);
//        }catch (ArithmeticException | InputMismatchException e){
//            System.out.println(e.getMessage());
//            System.out.println("some problem in my code");
//        }

//        func();


        Scanner scn = new Scanner(System.in);
        try{
            int a = scn.nextInt();
            int b = scn.nextInt();
            int div = a / b;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("division by zero error");
        }catch(RuntimeException e){
            System.out.println("there is runtime exception -> triggered in my code");
        }catch(Exception e){
            System.out.println("there is some exception -> triggered in my code");
        }finally {
            System.out.println("this block is triggered towards the end");
        }

    }

    static void func(){
        System.out.println("inside function");
        func();
    }


}