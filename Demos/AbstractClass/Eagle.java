package Demos.AbstractClass;

public class Eagle extends Animal implements Walkable,Flyable{
    void makeNoise(){
        System.out.println("Eagle is making noise");
    }
    public void walk(){
        System.out.println("Eagle is walking");
    }
    public void fly(){
        System.out.println("Eagle is flying");
    }
}
