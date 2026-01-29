package Command;

public class Stop implements Command{
    @Override
    public String execute(String s) {
        return "stopping the game";
    }

    @Override
    public boolean exit() {
        return true;
    }

    @Override
    public String helpText() {
        return "command stop stops the game, the second parameter is ignored, usage: stop";
    }
}
