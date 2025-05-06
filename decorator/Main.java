package decorator;

import decorator.base.Button;
import decorator.base.SimpleButton;
import decorator.decorator.BadgeButton;
import decorator.decorator.IconButton;
import decorator.decorator.LoadingButton;

public class Main {
    public static void main(String[] args) {
        // Base button
        Button button = new SimpleButton();

        // Decorating
        button = new IconButton(button);
        button = new BadgeButton(button);
        button = new LoadingButton(button);

        // Render decorated button
        button.render();
    }
}
