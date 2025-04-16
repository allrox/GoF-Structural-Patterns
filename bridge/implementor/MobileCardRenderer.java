package bridge.implementor;

// This is a concrete implementation of the CardRenderer interface for mobile devices.
public class MobileCardRenderer implements CardRenderer {
    @Override
    public void draw(String title, String subtitle, String CTA, String InfoTag) {
        System.out.println("Rendering Mobile Card...");
        System.out.println(
            title + " | " + subtitle + " | " + 

            // Using ternary operator to check if InfoTag and CTA are null or not.
            // If they are not null, we concatenate them with the string.
            (InfoTag != null ? InfoTag + " | " : "") +
            (CTA != null ? CTA : "")
        );

        // Just adding some space for better readability.
        System.out.println("\n");
    }
    
}
