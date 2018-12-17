package SimUDuck;

import SimUDuck.ducks.Duck;
import SimUDuck.ducks.MallardDuck;
import SimUDuck.ducks.RedheadDuck;
import SimUDuck.ducks.RubberDuck;

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Duck duck3 = new RubberDuck();
        duck1.display();
        duck3.display();
        duck1.fly();
        duck3.fly();
    }
}
