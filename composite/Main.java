package composite;

public class Main {
    public static void main(String[] args) {
        Button btn1 = new Button("Submit");
        Button btn2 = new Button("Cancel");

        Panel mainPanel = new Panel("Main Panel");
        mainPanel.add(btn1);
        mainPanel.add(btn2);

        mainPanel.render();
    }
}
