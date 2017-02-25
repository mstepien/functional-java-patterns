package pl.biz.smart.fpatterns.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

class Barista {
    private final Function<Coffee, Coffee> additions;
    
    private Barista(Function<Coffee, Coffee>... additions) {
        this.additions = Stream.of(additions)
                .reduce(Function.<Coffee>identity(), Function::andThen); 
    }

    private Coffee makeCoffee(Coffee coffee) {
        return this.additions.apply(coffee);
    }
    
    static Coffee makeCoffee(Coffee coffee, Function<Coffee, Coffee>... additions) {
        return new Barista(additions).makeCoffee(coffee);
    }

}
