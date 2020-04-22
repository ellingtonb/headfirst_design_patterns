package Objects;

import Interfaces.Beverage;

public class Expresso extends Beverage {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cost() {
        double cost = 1.99;

        if (getSize() == Size.GRANDE) {
            cost = 2.09;
        } else if (getSize() == Size.VENTI) {
            cost = 2.19;
        }

        return cost;
    }
}
