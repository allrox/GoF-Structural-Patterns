package decorator.decorator;

import decorator.base.Button;

public class IconButton extends ButtonDecorator {
    public IconButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" [ icon ]");
    }
}
