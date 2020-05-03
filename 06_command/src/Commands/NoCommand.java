package Commands;

import Interfaces.Command;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
