package decorator.decorator;

import decorator.base.Button;

public abstract class ButtonDecorator implements Button {
    protected Button decoratedButton;

    public ButtonDecorator(Button button) {
        this.decoratedButton = button;
    }

    public void render() {
        decoratedButton.render();
    }
}
