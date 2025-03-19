package Demos.NestedClass.StaticNestedClass;

public class Phone {
    static class Battery{
        void charging(){
            System.out.println("Battery is Charging");
        }
    }

    class MicroProcessor{
        void display(){
            System.out.println("Displaying micro processor");
        }
    }
}

class PhoneClient{
    public static void main(String[] args) {
        Phone.Battery b1 = new Phone.Battery();
        b1.charging();

        Phone p1 = new Phone();
        Phone.MicroProcessor m1  = p1.new MicroProcessor();
        m1.display();
    }
}
