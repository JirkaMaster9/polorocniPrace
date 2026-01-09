package Command;

public class Stop implements Command{
    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "stops the game";
    }
}
