package Behaviors.Quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Behaviors.Quack.Squeak");
    }
}
