package Demos.AbstractClass;

class Sparrow extends Animal implements Flyable{
    Sparrow(){
        this.name = "bird";
    }
    void makeNoise(){
        System.out.println("Chirping Sound by sparrow");
    }
    public void fly(){
        System.out.println("sparrow is flying");
    }
}