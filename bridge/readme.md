# 🌉 Bridge Pattern — GoF Structural Patterns

This project demonstrates the use of the **Bridge** design pattern, part of the Structural Patterns catalog from the GoF (Gang of Four), through a real-world inspired example involving **UI cards** rendered on different platforms (Web and Mobile).

---

## 📌 Pattern Intent

> *"Decouple an abstraction from its implementation so that the two can vary independently."*

The Bridge pattern allows you to design systems that are **flexible**, **extensible**, and **easier to maintain**, especially when you need to support **multiple implementations of the same abstraction** — like rendering a component differently on multiple platforms.

---

## 🧱 Project Structure and Responsibility

```
bridge/
├── abstraction/              # High-level card definitions (abstractions)
│   ├── Card.java             # Abstract base class
│   ├── ProductCard.java      # A card displaying a product (with CTA)
│   └── ProfileCard.java      # A card displaying a user profile (with InfoTag)
├── implementor/              # Renderers for different platforms (implementors)
│   ├── CardRenderer.java         # Common rendering interface
│   ├── WebCardRenderer.java     # Web-specific rendering logic
│   └── MobileCardRenderer.java  # Mobile-specific rendering logic
└── main/
    └── Main.java             # Demonstrates the pattern in action
```

---

## 🧩 Class Breakdown and Purpose

### 🔹 `Card.java` (Abstract Class)

This is the **Abstraction**. It holds a reference to a `CardRenderer` and declares an abstract method `render()`.

```java
protected CardRenderer renderer;

public Card(CardRenderer renderer) {
    this.renderer = renderer;
}

public abstract void render();
```

---

### 🔹 `ProductCard.java` and `ProfileCard.java` (Refined Abstractions)

Concrete implementations of `Card`, each defining its own logic to invoke the renderer:

```java
public class ProductCard extends Card {
    public void render() {
        renderer.draw("Nike Air Max", "R$599,90", "Em até 12x", "30% OFF");
    }
}
```

```java
public class ProfileCard extends Card {
    public void render() {
        renderer.draw("@AllRox", "USD 5.000", "Available", "MVP of the month");
    }
}
```

---

### 🔹 `CardRenderer.java` (Interface)

Defines the rendering contract for all platforms.

```java
public interface CardRenderer {
    void draw(String title, String subtitle, String CTA, String infoTag);
}
```

---

### 🔹 `WebCardRenderer.java` and `MobileCardRenderer.java` (Implementors)

Implement `CardRenderer` with logic specific to each platform.

**WebCardRenderer:**
```java
System.out.println("Rendering Web Card...");
System.out.println(title);
System.out.println(subtitle);
if(infoTag != null) System.out.println(infoTag);
if(CTA != null) System.out.println(CTA);
```

**MobileCardRenderer:**
```java
System.out.println("Rendering Mobile Card...");
System.out.println(title + " | " + subtitle);
if(infoTag != null) System.out.println("🏷 " + infoTag);
if(CTA != null) System.out.println("➡ " + CTA);
```

---

## 🚀 Demonstration (`Main.java`)

```java
Card productCardWeb = new ProductCard(new WebCardRenderer());
Card productCardMobile = new ProductCard(new MobileCardRenderer());

Card profileCardWeb = new ProfileCard(new WebCardRenderer());
Card profileCardMobile = new ProfileCard(new MobileCardRenderer());

productCardWeb.render();
productCardMobile.render();
profileCardWeb.render();
profileCardMobile.render();
```

---

## ✅ Console Output

```
Rendering Web Card...
Nike Air Max
R$599,90
30% OFF
Em até 12x

Rendering Mobile Card...
Nike Air Max | R$599,90
🏷 30% OFF
➡ Em até 12x

Rendering Web Card...
@AllRox
USD 5.000
MVP of the month
Available

Rendering Mobile Card...
@AllRox | USD 5.000
🏷 MVP of the month
➡ Available
```

---

## 💡 Notes on Real-World Usage

In actual front-end applications, the values passed to the renderer would come from props, API responses, or state.

This Java-based model simulates how you'd structure this flexibility using the Bridge pattern in a scalable way.

---

## 🧠 Why Use Bridge?

- Add new platforms or renderers without touching card logic
- Keep rendering behavior and content **independent**
- Avoid an explosion of subclasses (like `MobileProductCardWithInfoTag`)
- Gain flexibility to test, scale, and maintain easily

---

## 📚 References

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- Pattern type: **Structural**
- Core roles: `Card` (Abstraction) ↔ `CardRenderer` (Implementor)

---

> _“When systems are expected to grow, decoupling abstractions from implementations is not a luxury — it's a necessity.”_
