package Command;

public interface Command {
    String execute(String s);
    boolean exit();
    String helpText();}
