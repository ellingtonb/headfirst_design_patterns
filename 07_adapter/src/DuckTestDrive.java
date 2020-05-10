import Adapters.DuckAdapter;
import Adapters.TurkeyAdapter;
import Interfaces.Duck;
import Interfaces.Turkey;
import Objects.MallardDuck;
import Objects.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
