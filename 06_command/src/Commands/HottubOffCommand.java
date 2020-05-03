package Commands;

import Interfaces.Command;
import Objects.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.heat();
        hottub.on();
    }
}
