package SimUDuck.ducks;

import SimUDuck.fly.FlyBehavior;
import SimUDuck.quack.QuackBehavior;

abstract public class Duck implements FlyBehavior, QuackBehavior {

    public void swim() {
        System.out.println("swim");
    }

    abstract void display();

}
