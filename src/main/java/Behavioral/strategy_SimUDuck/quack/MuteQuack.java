package Behavioral.strategy_SimUDuck.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Silence");
    }
}
