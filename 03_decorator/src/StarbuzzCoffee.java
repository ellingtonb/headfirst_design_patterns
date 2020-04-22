import Decorators.Mocha;
import Decorators.Soy;
import Decorators.Whip;
import Interfaces.Beverage;
import Objects.DarkRoast;
import Objects.Expresso;
import Objects.HouseBlend;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        System.out.println("TALL SIZE");
        Beverage beverage = new Expresso();
        beverage.setSize(Beverage.Size.TALL);
        System.out.println(beverage.getDescription() + " $" + roundValue(beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + roundValue(beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + roundValue(beverage3.cost()));

        System.out.println("\nGRANDE SIZE");
        beverage = new Expresso();
        beverage.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + roundValue(beverage.cost()));

        beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + roundValue(beverage2.cost()));

        beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + roundValue(beverage3.cost()));

        System.out.println("\nVENTI SIZE");
        beverage = new Expresso();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $" + roundValue(beverage.cost()));

        beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + roundValue(beverage2.cost()));

        beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + roundValue(beverage3.cost()));
    }

    public static Double roundValue(double val) {
        return new BigDecimal(val).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
