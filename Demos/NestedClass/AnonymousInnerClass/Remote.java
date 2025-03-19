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
                System.out.println("Turning on "+TVName);
            }


            public void turnOn() {
                System.out.println("Turning off "+TVName);
            }
        };

        tv.turnOn();
        tv.turnOff();
    }

}
