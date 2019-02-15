package Behavioral.strategy_SimUDuck;

import Behavioral.strategy_SimUDuck.ducks.*;
import Behavioral.strategy_SimUDuck.fly.FlyRocketPowered;

public class Solution {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();
        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}