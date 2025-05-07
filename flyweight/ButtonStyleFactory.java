package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ButtonStyleFactory {
    private static final Map<String, ButtonStyle> styles = new HashMap<>();

    public static ButtonStyle getStyle(String backgroundColor, String textColor, String border) {
        String key = backgroundColor + "-" + textColor + "-" + border;

        if (!styles.containsKey(key)) {
            styles.put(key, new ButtonStyle(backgroundColor, textColor, border));
            System.out.println("Creating new ButtonStyle: " + key);
        }

        return styles.get(key);
    }
}
