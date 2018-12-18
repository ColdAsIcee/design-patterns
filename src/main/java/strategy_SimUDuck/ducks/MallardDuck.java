package strategy_SimUDuck.ducks;

import strategy_SimUDuck.fly.FlyWithWings;
import strategy_SimUDuck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("MallardDuck");
    }


}
