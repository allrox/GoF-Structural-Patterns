
# Decorator Pattern – Java Study

This repository demonstrates the **Decorator Pattern** applied to a UI engineering context, using Java.

The example simulates a **Button** component in a Design System, progressively enriched with additional features (like icons, badges, loading states) without modifying the original class.

---

## ✨ Why Decorator?

The **Decorator Pattern** allows us to dynamically add responsibilities to an object without altering its structure or requiring multiple subclasses.

In **UX Engineering**, this pattern aligns with how we progressively enhance UI components by wrapping them with additional functionality, keeping the **core component solid and reusable**.

---

## 🏗️ Project Structure

```plaintext
decorator/
├── base/
│   ├── Button.java
│   └── SimpleButton.java
├── decorator/
│   ├── ButtonDecorator.java
│   ├── BadgeButton.java
│   ├── IconButton.java
│   └── LoadingButton.java
└── Main.java
```

---

## 🔍 Class Descriptions

### ✅ `Button` (interface)

Defines the contract: every button must implement a `render()` method.

```java
public interface Button {
    void render();
}
```

This interface ensures that all buttons—decorated or not—can be used interchangeably wherever a `Button` is required.

---

### ✅ `SimpleButton` (base implementation)

A plain button that implements `Button` and prints a simple label.

```java
public class SimpleButton implements Button {
    public void render() {
        System.out.println("Simple button");
    }
}
```

This is the **base object** that decorators will enhance.

---

### ✅ `ButtonDecorator` (abstract decorator)

Abstract class implementing `Button`, holding a reference to a `Button` object.

It **delegates rendering to the wrapped button**, allowing subclasses to enrich the behavior.

```java
public abstract class ButtonDecorator implements Button {
    protected Button decoratedButton;

    public ButtonDecorator(Button button) {
        this.decoratedButton = button;
    }

    public void render() {
        decoratedButton.render();
    }
}
```

This class is the **foundation for all decorators**, ensuring they follow the same interface.

---

### ✅ Concrete Decorators

Each decorator extends `ButtonDecorator` and adds its own behavior **before or after** delegating to `super.render()`.

#### ➡️ `IconButton`

Adds an icon:

```java
public class IconButton extends ButtonDecorator {
    public IconButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" + Icon");
    }
}
```

---

#### ➡️ `BadgeButton`

Adds a badge:

```java
public class BadgeButton extends ButtonDecorator {
    public BadgeButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" + Badge");
    }
}
```

---

#### ➡️ `LoadingButton`

Adds a loading indicator:

```java
public class LoadingButton extends ButtonDecorator {
    public LoadingButton(Button button) {
        super(button);
    }

    public void render() {
        super.render();
        System.out.println(" + Loading...");
    }
}
```

---

## 🚀 Usage Example

In `Main.java` we instantiate a `SimpleButton` and progressively decorate it:

```java
Button button = new SimpleButton();

button = new IconButton(button);
button = new BadgeButton(button);
button = new LoadingButton(button);

button.render();
```

**Output:**

```plaintext
Simple button
 + Icon
 + Badge
 + Loading...
```

✅ Each decorator **adds new behavior while preserving the original button’s behavior**.

---

## 🎯 Key Learnings

✅ Each decorator **wraps the previous one**, maintaining the same interface (`Button`) and adding extra responsibilities.

✅ You can **add or remove decorators independently** without altering the base class.

✅ Promotes **Open/Closed Principle**: open for extension, closed for modification.

✅ Perfect for **UX Engineering and Design Systems**, where a base component needs variations without polluting the original code.

---

## 💬 How does this translate to real-world UX Engineering?

In React/Next.js, this pattern mirrors **component composition** where a base `Button` is wrapped by higher-order components or wrapper elements adding icons, badges, loading states—**without changing the original `Button` component.**

Example analogy in React:

```tsx
<LoadingButton>
  <BadgeButton>
    <IconButton>
      <Button label="Buy" />
    </IconButton>
  </BadgeButton>
</LoadingButton>
```

Each wrapper **decorates** the base `Button` with additional visuals or behavior.

---

## 📝 Conclusion

The Decorator Pattern is a powerful technique to extend functionality **without altering existing code**—essential for scalable, maintainable UI libraries.

This Java example brings software design patterns closer to everyday UX Engineering challenges.

---

✅ Check out the code and experiment with your own decorators!
