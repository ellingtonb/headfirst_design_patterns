package Objects;

import Interfaces.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        double cost = 0.89;

        if (getSize() == Size.GRANDE) {
            cost = 0.99;
        } else if (getSize() == Size.VENTI) {
            cost = 1.09;
        }

        return cost;
    }
}
