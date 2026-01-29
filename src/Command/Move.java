package Command;


import GameLogic.Character;
import Map.Coordinates;

public class Move implements Command{
    private Character character;



    @Override
    public String execute(String s) {
        Coordinates newcor;
        Coordinates cor = character.getCoordinates();
        switch (s){
            case "up" :
                newcor =new Coordinates(cor.getX(), cor.getY()+1);
                break;

            case "down" :
                newcor =new Coordinates(cor.getX(), cor.getY()-1);
                break;

            case "right" :
                newcor =new Coordinates(cor.getX()+1, cor.getY());
                break;

            case "left" :
                newcor =new Coordinates(cor.getX()-1, cor.getY()-1);
                break;


            default: return "invalid move command";
        }

        if (character.getMap().getInteractSpotMap().get(newcor)!=null){
            character.setCoordinates(newcor);
            character.setCurrentLocation(character.getMap().getInteractSpotMap().get(newcor));
        }else{
            return "cant move to that location curently at: "+character.getCoordinates();
        }
        return "moved to "+character.getCurrentLocation()+"named: "+character.getCurrentLocation().getName();
    }

    @Override
    public boolean exit() {
        return false;
    }

    @Override
    public String helpText() {
        return "moves player, move usage: move <parameter> (up,down,left,right) ";
    }

    public Move(Character character) {
        this.character = character;
    }
}
