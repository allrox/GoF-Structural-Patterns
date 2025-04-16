package bridge.abstraction;

import bridge.implementor.CardRenderer;

// This is the abstraction in the Bridge pattern.
// It defines the interface for the cards and holds a reference to the renderer.
// As it is an abstract class, it cannot be instantiated directly, that's the reason why we need ProductCard and ProfileCard classes to extend it.
public abstract class Card {
    
    // Set the renderer as protected so that the subclasses can access it directly.
    protected CardRenderer renderer;

    // Constructor that takes a CardRenderer as an argument.
    public Card(CardRenderer renderer) {
        this.renderer = renderer;
    }

    // Notice that render method is abstract so, subclasses must provide an implementation for it.
    public abstract void render();

}
