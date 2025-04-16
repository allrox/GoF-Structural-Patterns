package adapter.legacy;

// This class is our legacy color system. It has methods to get colors in hex format.
// For some reason, we can't change this class but need to use it in our modern system.
// So we will create an adapter to make it compatible with our new system.
public class LegacyPalette {
    public String getPrimary(){
        return "#FF5733"; 
    }

    public String getSecondary(){
        return "#33C1FF"; 
    }

    public String getBackground(){
        return "#EFEFEF"; 
    }
}