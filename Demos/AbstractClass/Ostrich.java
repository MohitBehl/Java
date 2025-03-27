package Demos.AbstractClass;

public class Ostrich extends Animal implements Walkable{
    void makeNoise(){
        System.out.println("Ostrich is making noise");
    }
    public void walk(){
        System.out.println("Ostrich is walking");
    }
}
