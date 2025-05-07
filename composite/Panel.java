package composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }
    public void add(Component component) {
        children.add(component);
    }
    
    public void render(){
        System.out.println("Rendering Panel: " + name);
        for(Component child: children) {
            child.render();
        }
    }

}
