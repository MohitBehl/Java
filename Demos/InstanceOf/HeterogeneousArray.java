package Demos.InstanceOf;

public class HeterogeneousArray {
    public static void main(String[] args) {
        Object[] arr = {"alex",10,3.14,true};
        for(Object o : arr){
            if(o instanceof Integer){
                System.out.println("Integer value : " + o);
            }else if(o instanceof String){
                System.out.println("String value : " + o);
            }else if(o instanceof Double){
                System.out.println("Double value : " + o);
            }else if(o instanceof Boolean){
                System.out.println("Boolean value: " + o);
            }
        }
    }
}
