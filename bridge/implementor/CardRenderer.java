package bridge.implementor;

// This is an interface to be implemented by the concrete renderers.
// It holds rendering responsibility but not the logic of the card itself.
public interface CardRenderer {
    void draw(String title, String subtitle, String CTA, String InfoTag);
}