package bridge.abstraction;

import bridge.implementor.CardRenderer;

// This class extends the abstract class and implement a render method.
// It represents a product card in the application and uses the CardRenderer to draw the card.
public class ProductCard extends Card{
    
    public ProductCard(CardRenderer renderer) {
        super(renderer);
    }

    // The render method is implemented here, it uses the renderer to draw the card.
    @Override
    public void render() {
        renderer.draw("Nike Air Max", "R$599,90", "Em até 12x", "30% Off");
    }
}
