package Command;

import GameLogic.Character;

public class RuneInventory implements Command{
    private Character character;

    public RuneInventory(Character character) {
        this.character = character;
    }

    @Override
    public String execute(String s) {
        return character.getRuneList().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "used to display the current runes that can be used in spells";
    }
}
