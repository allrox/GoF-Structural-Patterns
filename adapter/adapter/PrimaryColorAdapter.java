package adapter.adapter;

import adapter.modern.ColorToken;
import adapter.legacy.LegacyPalette;

// This is the adapter class that makes the legacy system compatible with the new system. It implements the ColorToken interface and uses an instance of LegacyPalette to get the primary color.

public class PrimaryColorAdapter implements ColorToken {
    private LegacyPalette legacyPalette;

    public PrimaryColorAdapter(LegacyPalette legacyPalette) {
        this.legacyPalette = legacyPalette;
    }

    // This block of code is the adapter method that translates the legacy method to the new one. It wraps get Primary() from Legacy Palette inside ColorToken getPrimaryColor() method.
    @Override
    public String getPrimaryColor() {
        return legacyPalette.getPrimary();
    }
    
}
