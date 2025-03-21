package Demos.NestedClass.InnerClass;

public class Car {
    String name;
    String color;
    String brand;
    private Engine engine;
    private GPSSystem gps;

    Car(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.engine = new Engine();
        this.gps = new GPSSystem();
    }

    private class Engine{
        Engine(){
            System.out.println("Engine class intializing for carName : "+name);
        }
    }

    private class GPSSystem{
        GPSSystem(){
            System.out.println("GPS system intializing for carName : "+name);
        }
    }

    class MusicSystem{
        MusicSystem(){
            System.out.println("Music system intializing for carName : "+name);
        }

        void playMusic(String songName){
            System.out.println(songName+" is playing in music system");
        }
    }
}

class CarClient{
    public static void main(String args[]){
        Car c1 = new Car("XYZ","Red","TATA");
        Car.MusicSystem m1 = c1.new MusicSystem();
        m1.playMusic("ABCD");
//        Car.Engine m1 = c1.new Engine(); // ERROR : not exposed
    }
}