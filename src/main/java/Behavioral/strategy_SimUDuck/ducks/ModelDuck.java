package Behavioral.strategy_SimUDuck.ducks;

import Behavioral.strategy_SimUDuck.fly.FlyNoWay;
import Behavioral.strategy_SimUDuck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
