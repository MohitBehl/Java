package Demos.NestedClass.AnonymousInnerClass;

public abstract class Computer {
    void login(){
        System.out.println("Logging in computer");
    }
}

class ComputerClient{
    public static void main(String[] args) {
        Computer c1 = new Computer(){

        };

        c1.login();
    }
}