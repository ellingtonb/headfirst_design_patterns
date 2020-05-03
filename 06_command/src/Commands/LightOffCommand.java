package Commands;

import Interfaces.Command;
import Objects.Light;

public class LightOffCommand implements Command {
    protected Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
