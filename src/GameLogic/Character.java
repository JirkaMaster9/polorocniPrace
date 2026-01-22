package GameLogic;
import Map.Coordinates;
import Map.InteractSpot;
import Map.Map;
import Item.Item;
import Rune.Rune;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private int health,maxHealth,mana,maxMana;
    private List <Item> itemList;
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
}
