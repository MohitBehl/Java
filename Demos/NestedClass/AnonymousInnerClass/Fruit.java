package Demos.NestedClass.AnonymousInnerClass;

interface Fruit{
    void eatingFruit(String fruitName);
}

class FruitClient{
    public static void main(String[] args) {
        Fruit obj = new Fruit() {
            public void eatingFruit(String fruitName) {
                System.out.println("Eating "+ fruitName);
            }
        };

        obj.eatingFruit("apple");
    }
}