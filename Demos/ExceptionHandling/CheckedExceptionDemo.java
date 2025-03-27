package Demos.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
//        System.out.println(readLinesFromFile());
        int n = 10;

    }

    public static String readLinesFromFile(){
        try{
            Scanner scanner = new Scanner(new File("file.txt"));
            return scanner.nextLine();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }

        return "sample input";
    }
}
