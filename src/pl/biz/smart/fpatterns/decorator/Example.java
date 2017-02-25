package pl.biz.smart.fpatterns.decorator;

public class Example {

    public static void main(String[] args) {
        Coffee coffee = Barista.makeCoffee(
                new Arabica(), Coffee::withMilk, Coffee::withSprinkles);
        
        System.out.println(coffee.getIngredients() + ". Cost: "+ coffee.getCost());
    }

}
