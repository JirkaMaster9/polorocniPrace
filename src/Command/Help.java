package Command;

import java.util.HashMap;

public class Help implements Command{

    private HashMap <String, Command> commands;
    @Override
    public String execute(String s) {
        if (commands.containsKey(s)) {
            return  commands.get(s).helpText();
        } else if (s.isEmpty()) {
            return this.helpText();
        } else{
            return "command "+s+" not found";
        }

    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "explaines how to use the command, help is used: help <commandName>";
    }

    public Help(HashMap prikazy) {
        this.commands = prikazy;
    }
}
