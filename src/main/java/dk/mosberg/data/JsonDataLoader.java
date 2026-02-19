package dk.mosberg.data;

import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDataLoader {
    private static final Gson gson = new GsonBuilder().create();

    public static <T> T load(String resourcePath, Class<T> clazz) {
        try (Reader reader = new InputStreamReader(
                JsonDataLoader.class.getClassLoader().getResourceAsStream(resourcePath))) {
            return gson.fromJson(reader, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load JSON: " + resourcePath, e);
        }
    }
}
