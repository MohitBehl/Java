package Demos.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourceAutoClosing {
    private static class client{
        public static void readingFileAndAutoClosingResource(){
            try( Scanner scn = new Scanner(new File("Demos/ExceptionHandling/Input.txt")) ){
                while(scn.hasNext()){
                    System.out.println(scn.nextLine());
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        public static void readingFile(){
            try{
                File file = new File("Demos/ExceptionHandling/Input.txt");
                Scanner scn = new Scanner(file);

                while(scn.hasNext()){
                    System.out.println(scn.nextLine());
                }

                scn.close();
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
            readingFile();
            readingFileAndAutoClosingResource();
        }
    }
}
