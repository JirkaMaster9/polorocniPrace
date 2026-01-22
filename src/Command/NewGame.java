package Command;

public class NewGame implements Command {
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
        return "creates a new game";
    }
}
