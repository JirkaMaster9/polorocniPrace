package Command;

public class Help implements Command{
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
        return "returns this text";
    }
}
