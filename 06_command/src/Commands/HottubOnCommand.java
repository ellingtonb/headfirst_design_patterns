package Commands;

import Interfaces.Command;
import Objects.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }

    @Override
    public void undo() {
        hottub.bubblesOff();
        hottub.cool();
        hottub.off();
    }
}
