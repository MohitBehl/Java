package Demos.FinalKeyword;

class FinalDemo {
    final int count;
    boolean flag = true;
    FinalDemo(int value){
        this.count = value;
    }
    final void method1(){
        System.out.println("this is method body of method1() of parent class");
    }
    void method2(){
        System.out.println("this is method body of method2() of parent class");
    }
}

final class child extends FinalDemo {
    child() {
        super(0);
    }
    child(int value) {
        super(value);
    }
    /**
    void method1(){ // Error : can't override final method
        System.out.println("this is method body of method1() of child");
    }
     */
    void method2() {
        System.out.println("this is method body of method2() of child class");
    }
}

/**
 class helper extends child{ // final class can't be inherited

 }
*/


class FinalKeywordDemoClient{
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo(5);
        System.out.println(obj.count);
        obj.flag = false;
        System.out.println(obj.flag);

        child c1 = new child();
        c1.method2();
        c1.method1();

        FinalDemo obj1 = new FinalDemo(10);
    }
}
