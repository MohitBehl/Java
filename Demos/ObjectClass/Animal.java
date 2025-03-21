package Demos.ObjectClass;

public class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void makesNoise(){
        System.out.println("Animal with name" + name +" is making noise");
    }

    public String toString() {
        return "Animal name : "+name;
    }

    public boolean equals(Animal o) {
        return this.name.equals(o.name);
    }
}

class AnimalClient{
    public static void main(String[] args) {
        Animal a1 = new Animal("Bird");
        Animal a2 = new Animal("Dog");
        Animal a3 = new Animal("Bird");

        System.out.println(a1.toString());
        System.out.println(a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
}
