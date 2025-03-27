package Demos.AbstractClass;

public class Crow extends Animal implements Walkable, Flyable{
    void makeNoise() {
        System.out.println("crow is making noise");
    }

    public void walk(){
        System.out.println("crow is walking");
    }

    public void fly(){
        System.out.println("crow is flying");
    }
}
