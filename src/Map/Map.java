package Map;

import java.util.HashMap;

public class Map {
    private HashMap<Coordinates, InteractSpot> InteractSpotMap;
    private String mapName;

    public Map(HashMap<Coordinates, InteractSpot> interactSpotMap, String mapName) {
        InteractSpotMap = interactSpotMap;
        this.mapName = mapName;
    }

    public HashMap<Coordinates, InteractSpot> getInteractSpotMap() {
        return InteractSpotMap;
    }

    public void setInteractSpotMap(HashMap<Coordinates, InteractSpot> interactSpotMap) {
        InteractSpotMap = interactSpotMap;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    @Override
    public String toString() {
        return "Map{" +
                "InteractSpotMap=" + InteractSpotMap +
                ", mapName='" + mapName + '\'' +
                '}';
    }
}
