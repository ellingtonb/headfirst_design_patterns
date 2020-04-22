package Objects;

import Interfaces.Beverage;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public double cost() {
        double cost = 1.05;

        if (getSize() == Size.GRANDE) {
            cost = 1.15;
        } else if (getSize() == Size.VENTI) {
            cost = 1.25;
        }

        return cost;
    }
}
