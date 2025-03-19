package Demos.NestedClass.LocalInnerClass;

public class Pizza {
    void preparePizza(){
        class Kitchen{
            void provideHeat(){
                System.out.println("Heating the oven");
            }
        }

        Kitchen k1 = new Kitchen();
        k1.provideHeat();
    }
}

class PizzaClient{
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        p1.preparePizza();
    }
}

// creating object -> p1.preparePizza() -> object of kitchen -> k1 -> k1.provide HEat
