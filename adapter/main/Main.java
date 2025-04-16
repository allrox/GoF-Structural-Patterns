package adapter.main;

import adapter.adapter.ColorAdapter;
import adapter.legacy.LegacyPalette;
import adapter.modern.ColorToken;

public class Main {
    public static void main(String[] args) {

        // Here we are using the legacy system directly to get the primary color and printing it. This is how things were done before the new system was introduced.
        LegacyPalette oldPalette = new LegacyPalette();
        System.out.println("Printing the legacy system directly...");
        System.out.println("Primary color from legacy system: " + oldPalette.getPrimary());
        System.out.println("Secondary color from legacy system: " + oldPalette.getSecondary() + "\n");
        
        // Now we are using the new system with the adapter to get the primary color from the legacy system. The adapter makes it possible to use the legacy system in a modern way.
        ColorToken adapted = new ColorAdapter(oldPalette);
        System.out.println("Printing the legacy system via adapter...");
        System.out.println("Primary color via adapter: " + adapted.getPrimaryColor());
        System.out.println("Secondary color via adapter: " + adapted.getSecondaryColor() + "\n");

    }
}
