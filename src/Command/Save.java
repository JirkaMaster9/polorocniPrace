package Command;

public class Save implements Command{
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
        return "saves the game to file";
    }
}
