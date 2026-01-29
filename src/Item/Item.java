package Item;

import GameLogic.Character;

public  class Item {
    private String name;
    private String iteminfo;
    private int addMana,addHealth;
    private Character character;
    public void useItem(){
        character.setMana(addMana+character.getMana());
        character.setHealth(addHealth+character.getHealth());
        if (character.getMana()>character.getMaxMana()){
            character.setMana(character.getMaxMana());
        }
        if (character.getHealth()>character.getMaxHealth()){
            character.setHealth(character.getMaxHealth());
        }
    }

    public String getName() {
        return name;
    }
}
