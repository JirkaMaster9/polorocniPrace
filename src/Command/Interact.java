package Command;

import GameLogic.Character;

public class Interact implements Command{
    private Character character;
    @Override
    public String execute(String s) {

        return character.getCurrentLocation().OnInteraction();
    }


    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "allows you to interact with good npc or chests not recommend to use on a enemy";
    }

    public Interact(Character character) {
        this.character = character;
    }
}
