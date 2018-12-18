package strategy_SimUDuck.ducks;

import strategy_SimUDuck.fly.FlyNoWay;
import strategy_SimUDuck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
