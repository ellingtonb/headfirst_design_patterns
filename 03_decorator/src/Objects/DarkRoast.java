package Objects;

import Interfaces.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        double cost = 0.99;

        if (getSize() == Size.GRANDE) {
            cost = 1.09;
        } else if (getSize() == Size.VENTI) {
            cost = 1.19;
        }

        return cost;
    }
}
