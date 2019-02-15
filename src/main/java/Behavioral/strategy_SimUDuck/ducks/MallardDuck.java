package Behavioral.strategy_SimUDuck.ducks;

import Behavioral.strategy_SimUDuck.fly.FlyWithWings;
import Behavioral.strategy_SimUDuck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("MallardDuck");
    }


}
