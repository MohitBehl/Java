package Demos.AbstractClass;

class Monkey extends Animal implements Walkable,Climbable{
    void makeNoise(){
        System.out.println("monkey Sound");
    }
    public void climb(){
        System.out.println("monkey is climbing");
    }
    public void walk(){
        System.out.println("monkey is walking");
    }
}
