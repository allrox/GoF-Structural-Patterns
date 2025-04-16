package adapter.modern;

// This is the new interface that we want to use in our modern system. It has a method getPrimaryColor() that returns a color in hex format.
public interface ColorToken {

    // This method is the one we want to use in our modern system. It returns a color from a global source in hex format.
    String getPrimaryColor();

}