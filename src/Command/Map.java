package Command;

import GameLogic.Character;
import Map.Coordinates;

public class Map implements Command{
    private Character character;
    @Override
    public String execute(String s) {
        String map = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                if (character.getMap().getInteractSpotMap().get(new Coordinates(i,j))==null){
                   map = map + "   ";
                } else if (character.getMap().getInteractSpotMap().get(new Coordinates(i,j)).getHasEnemy()) {
                    map = map + " x ";
                }else{
                    map = map + " o ";
                }
            }
            map= map+"\n";

        }
        return map;
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "returns an asciart of the map where x is a enemy and o is a friendly boost, map is used: map";
    }

    public Map(Character character) {
        this.character = character;
    }
}
