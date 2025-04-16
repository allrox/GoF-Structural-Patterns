package bridge.abstraction;

import bridge.implementor.CardRenderer;

// This class extends the abstract class and implement a render method.
// // It represents a profile card in the application and uses the CardRenderer to draw the card.
public class ProfileCard extends Card {
    
    public ProfileCard(CardRenderer renderer) {
        super(renderer);
    }

    // The render method is implemented here, it uses the renderer to draw the card.
    @Override
    public void render() {
        renderer.draw("@AllRox", "USD 5.000", "Available", "MVP of the month");
    }

    
}
