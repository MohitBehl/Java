package Demos.AbstractClass;

abstract class Animal {
    String name;
    abstract void makeNoise();
    void moveYourself(){
        System.out.println("Animal : " + name +"  is moving as requested");
    }
}







