package Demos.AbstractClass;

interface flyable{
    void fly();
}

interface climbable{
    void climb();
}

interface walkable{
    void walk();
}

abstract class Animal {
    String name;
    abstract void makeNoise();
    void moveYourself(){
        System.out.println("Animal : " + name +"  is moving as requested");
    }
}

class Monkey extends Animal implements walkable,climbable{
    void makeNoise(){
        System.out.println("monkey Sound");
    }
    public void climb(){
    }
    public void walk(){

    }
}

class Bird extends Animal implements flyable{
    Bird(){
        this.name = "bird";
    }
    void makeNoise(){
        System.out.println("Chirping Sound");
    }
    public void fly(){
        System.out.println("bird is flying");
    }
}

class Dog extends Animal implements walkable{
    Dog(){
        this.name = "dog";
    }
    void makeNoise(){
        System.out.println("Barking");
    }
    public void walk(){

    }
}

class AnimalClient{
    public static void main(String[] args) {
        Animal o1 = new Bird();
        Animal o2 = new Dog();
        o1.makeNoise();
        o1.moveYourself();
        o2.makeNoise();
        o2.moveYourself();
    }
}

