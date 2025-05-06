package decorator.decorator;

import decorator.base.Button;

public class LoadingButton extends ButtonDecorator {
    public LoadingButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" Loading...");
    }
}
