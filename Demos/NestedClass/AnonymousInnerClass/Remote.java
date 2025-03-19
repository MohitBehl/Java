package Demos.NestedClass.AnonymousInnerClass;

public interface Remote {
    void turnOff();
    void turnOn();
}

class RemoteClient{
    public static void main(String[] args) {
        Remote tv = new Remote() {
            String TVName = "LG";
            public void turnOff() {
                System.out.println("Turning off "+TVName);
            }


            public void turnOn() {
                System.out.println("Turning on "+TVName);
            }
        };

        tv.turnOn();
        tv.turnOff();

        Remote toyCar = new Remote(){
            String color = "Red";
            public void turnOff() {
                System.out.println("Turning off car of "+color + " color");
            }


            public void turnOn() {
                System.out.println("Turning on car of "+color + " color");
            }
        };

        toyCar.turnOn();
        toyCar.turnOff();
    }

}
