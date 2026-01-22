package Map;

import java.util.ArrayList;

public class TurboMap {
    private ArrayList <Map> maps;

    public TurboMap(ArrayList<Map> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "TurboMap{" +
                "maps=" + maps +
                '}';
    }

    public ArrayList<Map> getMaps() {
        return maps;
    }

    public void setMaps(ArrayList<Map> maps) {
        this.maps = maps;
    }
}
