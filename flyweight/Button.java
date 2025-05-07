package flyweight;

public class Button {
    private final String label;
    private final int x;
    private final int y;
    private final ButtonStyle style;

    public Button(String label, int x, int y, ButtonStyle style) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.applyStyle(label, x, y);
    }
}
