package bridge.implementor;

// This is a concrete implementation of the CardRenderer interface for web applications.
public class WebCardRenderer implements CardRenderer {
    @Override
    public void draw(String title, String subtitle, String CTA, String InfoTag) {
        System.out.println("Rendering Web Card...");
        System.out.println(title);
        System.out.println(subtitle);
        if(InfoTag != null) System.out.println(InfoTag);
        if(CTA != null) System.out.println(CTA);
        System.out.println("\n");
    }
    
}
