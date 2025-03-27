package Demos.AbstractClass;

class Dog extends Animal implements Walkable{
    Dog(){
        this.name = "dog";
    }
    void makeNoise(){
        System.out.println("Barking");
    }
    public void walk(){
        System.out.println("dog is walking");
    }
}
