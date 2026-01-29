package Command;

import GameLogic.Character;

import java.util.Objects;

public class UseItem implements Command{
    private Character character;

    public UseItem(Character character) {
        this.character = character;
    }

    @Override
    public String execute(String s) {
        if (s.isEmpty()){
            return this.helpText();
        }

        for (int i = 0; i < character.getItemList().size(); i++) {
            if (Objects.equals(character.getItemList().get(i).getName(), s)){
                character.getItemList().get(i).useItem();
                return "used item "+character.getItemList().get(i).getName();
            }



        }
        return "no item with that name found";
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "use an item from inventory usage : use <item name>";
    }
}
