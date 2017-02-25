package pl.biz.smart.fpatterns.decorator;

class Arabica implements Coffee {

    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getIngredients() {
        return "Coffee Arabica";
    }

}
