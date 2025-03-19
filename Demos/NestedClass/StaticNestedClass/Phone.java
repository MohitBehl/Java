package Demos.NestedClass.StaticNestedClass;

public class Phone {
    static class Battery{
        void charging(){
            System.out.println("Battery is Charging");
        }
    }
}

class PhoneClient{
    public static void main(String[] args) {
        Phone.Battery b1 = new Phone.Battery();
        b1.charging();
    }
}
