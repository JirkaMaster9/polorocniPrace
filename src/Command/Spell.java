package Command;

import GameLogic.Character;

public class Spell implements Command{
    private Character character;

    public Spell(Character character) {
        this.character = character;
    }

    @Override
    public String execute(String s) {
        float damage=0,mana=0;
        for (int i = 0; i < character.getRuneList().size(); i++) {
            for (int j = 0; j <countContains(s,character.getRuneList().get(i).getName()); j++) {
               damage = character.getRuneList().get(i).countDamage(damage);
               mana = character.getRuneList().get(i).countMana(mana);
            }
        }
        character.setMana(character.getMana()+mana);
        //todo make it do damage
        return "damage "+damage+" mana "+mana;
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "";
    }
    public static int countContains(String text, String sub) {
        if (sub.isEmpty()) return 0;

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }
}
