package pl.biz.smart.fpatterns.decorator;

interface Coffee {
    
    double getCost();
    String getIngredients();

    static Coffee withMilk(Coffee coffee) {
        return new Coffee() {
            @Override
            public double getCost() {
                return coffee.getCost() + 0.5;
            }

            @Override
            public String getIngredients() {
                return coffee.getIngredients() + ", Milk";
            }
        };
    }

    static Coffee withSprinkles(Coffee coffee) {
        return new Coffee() {
            @Override
            public double getCost() {
                return coffee.getCost() + 0.2;
            }

            @Override
            public String getIngredients() {
                return coffee.getIngredients() + ", Sprinkles";
            }
        };
    }

}
