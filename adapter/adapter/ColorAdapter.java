package adapter.adapter;

import adapter.modern.ColorToken;
import adapter.legacy.LegacyPalette;

// This is the adapter class that makes the legacy system compatible with the new system. It implements the ColorToken interface and uses an instance of LegacyPalette to get colors.

public class ColorAdapter implements ColorToken {
    private LegacyPalette legacyPalette;

    public ColorAdapter(LegacyPalette legacyPalette) {
        this.legacyPalette = legacyPalette;
    }

    // This block of code is the adapter method that translates the legacy method to the new one. It wraps getPrimary() and getSecondary() from Legacy Palette.
    @Override
    public String getPrimaryColor() {
        return legacyPalette.getPrimary();
    }

    @Override
    public String getSecondaryColor() {
        return legacyPalette.getSecondary();
    }
    
}
