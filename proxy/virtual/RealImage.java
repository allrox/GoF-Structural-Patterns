package proxy.virtual;
public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // simula operação pesada
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    public void display() {
        System.out.println("Displaying " + filename);
    }
}
