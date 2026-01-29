package GameLogic;
import Map.Coordinates;
import Map.InteractSpot;
import Map.Map;
import Item.Item;
import Rune.Rune;

import java.util.ArrayList;

public class Character {
    private String name;
    private int health,maxHealth,mana,maxMana;
    private ArrayList <Item> itemList;
    private ArrayList <Rune> runeList;
    private InteractSpot currentLocation;
    private Map map;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public InteractSpot getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(InteractSpot currentLocation) {
        this.currentLocation = currentLocation;
    }

    private Coordinates coordinates;

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", mana=" + mana +
                ", maxMana=" + maxMana +
                ", itemList=" + itemList +
                ", runeList=" + runeList +
                ", currentLocation=" + currentLocation +
                ", map=" + map +
                ", coordinates=" + coordinates +
                '}';
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }


    public ArrayList<Rune> getRuneList() {
        return runeList;
    }

    public void setRuneList(ArrayList<Rune> runeList) {
        this.runeList = runeList;
    }
}
