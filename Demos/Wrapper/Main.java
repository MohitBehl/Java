package Demos.Wrapper;

public class Main {
    public static void main(String[] args) {
//        int v1 = 5;
//        Integer v2 = 10;
//
//        System.out.println(Integer.toBinaryString(10));
//        System.out.println(Integer.MIN_VALUE);
//        String s1 = "12345";
//        int valS1 = Integer.parseInt(s1);
//        System.out.println(valS1);
//        System.out.println(Double.toHexString(123.10));
//        Double d1 = Double.parseDouble("3.14");
//        System.out.println(d1);

//        int val1 = 10;
//        Integer val2 = val1; // auto-boxing
//        System.out.println(val2);
//        int val3 = val2; // unboxing
//        System.out.println(val3);

//        Integer[] integerArr = {10,20,30,40,50};
//        for(Integer vl : integerArr){
//            System.out.print(vl+" ");
//        }

        Object[] objArr = {"hello",10,3.14,true,'a'};
        for(Object o : objArr){
            System.out.print(o+" ");
        }
    }
}
