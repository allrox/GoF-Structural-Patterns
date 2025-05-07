package composite;

public class Button implements Component {
    
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void render(){
        System.out.println("Rendering Button: " + label);
    }
    
}
