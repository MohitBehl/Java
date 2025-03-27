package Demos.ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}


public class ExceptionCreationDemo {

    static void takingInputWhileGeneratingException() throws InvalidAgeException{
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        int age = scn.nextInt();

        if(age < 0){
            throw new InvalidAgeException("age shouldn't be negative");
//            throw new Exception("age < 0");
        }

        System.out.println(name +" "+age);
    }

    public static void main(String[] args){
        try{
            takingInputWhileGeneratingException();
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
