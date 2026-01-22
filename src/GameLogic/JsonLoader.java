package GameLogic;

import Map.TurboMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonLoader {
    public static TurboMap loadMap(String s) {
        try (Reader reader = new FileReader(s)) {
            // Use GsonBuilder to enable support for Map keys that are Objects
            Gson gson = new GsonBuilder()
                    .enableComplexMapKeySerialization()
                    .create();

            return gson.fromJson(reader, TurboMap.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load map file: " + s, e);
        }
    }
}