package GameLogic;

import Command.Console;
import Map.Map;
import Map.Coordinates;
import Map.TurboMap;

import static GameLogic.JsonLoader.loadMap;

public class GameLoop {
    private boolean isExit = false;
    public void start() {

        Character character = new Character();
        Coordinates cor = new Coordinates(1,2);
        TurboMap turboloadedMap= JsonLoader.loadMap("resources/gamedata.json");
        character.setCurrentLocation(turboloadedMap.getMaps().getFirst().getInteractSpotMap().get(cor));
        character.setMap(turboloadedMap.getMaps().getFirst());
        character.setCoordinates(cor);

//        character.setMap();
//        character.setCurrentLocation();
//        character.setCoordinates();


        Console console = new Console(character,this);
        console.inicializator();


        do {
            console.execute();

        } while (!isExit);
    }

    public void setExit(boolean exit) {
        isExit = exit;
    }
}
