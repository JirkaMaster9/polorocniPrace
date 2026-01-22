package Command;

public class Load implements Command{
    @Override
    public String execute(String s) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "sets the state of the game to the one saved in file";
    }
}
