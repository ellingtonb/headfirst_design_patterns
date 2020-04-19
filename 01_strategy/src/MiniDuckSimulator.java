import Behaviors.Fly.FlyRocketPowered;
import Objects.Duck;
import Objects.MallardDuck;
import Objects.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Normal Duck
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n---------------\n");

        // Powered Duck
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
