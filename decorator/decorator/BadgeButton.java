package decorator.decorator;

import decorator.base.Button;

public class BadgeButton extends ButtonDecorator {
    public BadgeButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" badge ");
    }
}
