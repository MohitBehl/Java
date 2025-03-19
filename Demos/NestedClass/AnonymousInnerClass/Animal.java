package Demos.NestedClass.AnonymousInnerClass;

abstract class Animal{
    abstract void speak();
}

class Dog extends Animal{
    void speak(){
        System.out.println("Barking");
    }
}



class AnimalClient {
    public static void main(String[] args){
        Dog d = new Dog();
        d.speak();

        Animal cat = new Animal() { //
            void speak() {
                System.out.println("meow");
            }
        };
        cat.speak();
    }
}