package flyweight;

public class Main {
    public static void main(String[] args) {
        ButtonStyle primaryStyle = ButtonStyleFactory.getStyle("#00FFAA", "#000000", "rounded");
        ButtonStyle secondaryStyle = ButtonStyleFactory.getStyle("#CCCCCC", "#222222", "flat");

        Button btn1 = new Button("Save", 10, 20, primaryStyle);
        Button btn2 = new Button("Cancel", 110, 20, secondaryStyle);
        Button btn3 = new Button("Buy", 210, 20, primaryStyle); // same style as btn1

        btn1.render();
        btn2.render();
        btn3.render(); // reuses same style instance as btn1
    }
}
