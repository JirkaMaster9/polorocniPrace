import GameLogic.GameLoop;
import GameLogic.JsonLoader;

public class Main {
    public static void main(String[] args) {

//        System.out.println(JsonLoader.loadMap("resources/gamedata.json"));


        GameLoop gameLoop = new GameLoop();
        gameLoop.start();

    }
}