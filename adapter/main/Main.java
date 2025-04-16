package adapter.main;

import adapter.adapter.PrimaryColorAdapter;
import adapter.legacy.LegacyPalette;
import adapter.modern.ColorToken;

public class Main {
    public static void main(String[] args) {

        // Here we are using the legacy system directly to get the primary color and printing it. This is how things were done before the new system was introduced.
        LegacyPalette oldPalette = new LegacyPalette();
        System.out.println("Primary color from legacy system: " + oldPalette.getPrimary());
        
        // Now we are using the new system with the adapter to get the primary color from the legacy system. The adapter makes it possible to use the legacy system in a modern way.
        ColorToken adapted = new PrimaryColorAdapter(oldPalette);
        System.out.println("Primary color via adapter: " + adapted.getPrimaryColor());

    }
}
