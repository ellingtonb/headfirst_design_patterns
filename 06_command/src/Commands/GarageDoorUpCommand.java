package Commands;

import Interfaces.Command;
import Objects.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
