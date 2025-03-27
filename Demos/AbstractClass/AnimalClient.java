package Demos.AbstractClass;

import B1.AnimalKingdom.Flyable;

import java.util.ArrayList;
import java.util.List;

class AnimalClient{
    public static void main(String[] args) {
//        Animal a1 = new Animal() { // anonymous inner class
//            void makeNoise() {
//                System.out.println("animal makes noise");
//            }
//        };
//
//        Animal o1 = new Sparrow();
//        Animal o2 = new Dog();
//        o1.makeNoise();
//        o1.moveYourself();
//        o2.makeNoise();
//        o2.moveYourself();

        List<Flyable> list = new ArrayList<>();

        Animal crow = new Crow();
        Animal dog = new Dog();
        Animal eagle = new Eagle();
        Animal ostrich = new Ostrich();
        Animal sparrow = new Sparrow();
        Animal monkey = new Monkey();

        Animal[] allAnimals = {crow,dog,eagle,ostrich,sparrow,monkey};

        for(Animal animal : allAnimals){
            animal.makeNoise();
            if(animal instanceof Crow){
                ((Crow) animal).fly();
            }else if(animal instanceof Sparrow){
                ((Sparrow) animal).fly();
            }else if(animal instanceof Eagle){
                ((Eagle) animal).fly();
            }else if(animal instanceof Monkey){
                ((Monkey) animal).climb();
            }else if(animal instanceof Dog){
                ((Dog) animal).walk();
            }else if(animal instanceof Ostrich){
                ((Ostrich) animal).walk();
            }
            System.out.println("-----------------------");
        }
    }
}