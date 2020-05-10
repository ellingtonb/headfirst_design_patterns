package Adapters;

import Interfaces.Duck;
import Interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    protected Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
