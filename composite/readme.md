
# 🧩 Composite Pattern — Java Implementation

This repository contains a simple and focused implementation of the **Composite Pattern** in Java, structured for clarity and easy reference.

## 💡 Purpose

The **Composite Pattern** allows you to treat individual objects and compositions of objects **uniformly**.

This pattern is especially useful for creating tree-like structures where individual elements and containers share a common interface.

In this example, we simulate a basic UI structure with `Button` (a leaf) and `Panel` (a composite that can contain other components).

---

## 📦 Project Structure

```
composite/
├── Component.java     # Common interface
├── Button.java        # Leaf node (simple component)
├── Panel.java         # Composite node (container of components)
└── Main.java          # Entry point to demonstrate the structure
```

---

## 🧠 Key Concepts

### `Component.java`

```java
public interface Component {
    void render();
}
```

This interface is the **contract** shared by both individual elements (leaf nodes) and groups (composite nodes).

---

### `Button.java`

```java
public class Button implements Component {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void render() {
        System.out.println("Rendering Button: " + label);
    }
}
```

Represents a simple element — a **leaf** in the structure. It implements `Component` and defines its own rendering logic.

---

### `Panel.java`

```java
public class Panel implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void render() {
        System.out.println("Rendering Panel: " + name);
        for (Component child : children) {
            child.render();
        }
    }
}
```

Represents a **composite** object — it holds a list of components and renders each one recursively.  
It also implements the `Component` interface.

---

### `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        Component button1 = new Button("Save");
        Component button2 = new Button("Cancel");

        Panel panel = new Panel("Main Panel");
        panel.add(button1);
        panel.add(button2);

        panel.render();
    }
}
```

Demonstrates the pattern in action. We create individual components and group them inside a composite.  
Calling `panel.render()` renders both the panel and its internal components.

---

## ✅ Benefits of the Composite Pattern

- Treats **individual** and **grouped** objects in the **same way**
- Avoids complex conditionals to distinguish between “simple” and “composite” components
- Supports **recursive structures**
- Great for **UI frameworks**, **file systems**, and **organizational hierarchies**

---

## 📌 Summary

This is a minimal and clear example of the **Composite Pattern** applied in Java, perfect for learning, revision, and application in real projects — especially in frontend architectures, component systems, and structured rendering logic.

---

> Designed for study purposes as part of the [GoF Structural Patterns series](https://github.com/allrox/gof-structural-patterns).
