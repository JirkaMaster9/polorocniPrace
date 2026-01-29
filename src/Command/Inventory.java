package Command;

import GameLogic.Character;

public class Inventory implements Command{
    private Character character;

    public Inventory(Character character) {
        this.character = character;
    }

    @Override
    public String execute(String s) {

        return character.getItemList().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "used to display the current items in inventory";
    }
}
