package flyweight;

public class ButtonStyle {
    private final String backgroundColor;
    private final String textColor;
    private final String border;

    public ButtonStyle(String backgroundColor, String textColor, String border) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.border = border;
    }

    public void applyStyle(String label, int x, int y) {
        System.out.println("Rendering button '" + label + "' at (" + x + "," + y + ") with style:");
        System.out.println("  BG Color: " + backgroundColor + ", Text Color: " + textColor + ", Border: " + border);
    }
}
