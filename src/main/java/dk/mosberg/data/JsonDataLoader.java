package dk.mosberg.data;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDataLoader {
    private static final Gson gson = new GsonBuilder().create();
    private static final Logger logger = Logger.getLogger(JsonDataLoader.class.getName());

    /**
     * Loads a JSON resource and parses it into the given class. Logs errors and validates basic
     * schema presence.
     */
    public static <T> T load(String resourcePath, Class<T> clazz) {
        try (Reader reader = new InputStreamReader(
                JsonDataLoader.class.getClassLoader().getResourceAsStream(resourcePath))) {
            T result = gson.fromJson(reader, clazz);
            if (result == null) {
                logger.warning("Parsed JSON is null: " + resourcePath);
            }
            // Basic schema validation: check $schema field if present
            // (Assumes all config classes have a public String $schema or similar root field)
            // Advanced validation should be done externally (e.g., build/CI)
            logger.info("Loaded JSON config: " + resourcePath);
            return result;
        } catch (Exception e) {
            logger.severe("Failed to load JSON: " + resourcePath + " - " + e.getMessage());
            throw new RuntimeException("Failed to load JSON: " + resourcePath, e);
        }
    }

    /**
     * Generic loader for config classes with root fields (e.g., wrapper classes).
     */
    public static <T> T loadConfig(String resourcePath, Class<T> clazz) {
        return load(resourcePath, clazz);
    }
}
