# 🧩 Adapter Pattern — GoF Structural Patterns

This project demonstrates the use of the **Adapter** design pattern (structural category) through a practical example involving a legacy design system and modern color tokens.

---

## 📌 Pattern Intent

> Convert the interface of a class into another interface clients expect.  
> Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

In this case, we simulate a real-world situation where a **legacy color system** provides hardcoded color methods (`getPrimary()`, `getSecondary()`, etc.), while the **new system** expects a modern interface with a single method: `getPrimaryColor()`.

---

## 🧱 Project Structure

```text
adapter/
├── adapter/
│   └── PrimaryColorAdapter.java
├── legacy/
│   └── LegacyPalette.java
├── modern/
│   └── ColorToken.java
└── main/
    └── Main.java
```

---

## 🧠 Context of Use

This pattern is useful when:

- You need to **integrate legacy code** into a modern system
- You want to avoid **modifying the original implementation**
- You want a **safe transition** between old and new systems, supporting rollback if necessary

---

## 🎯 Practical Example

- `LegacyPalette` is an old class with specific color methods (`getPrimary()`, etc.)
- `ColorToken` is the new standard interface
- `PrimaryColorAdapter` implements `ColorToken` and internally uses a `LegacyPalette` instance to provide compatibility

---

## 🔍 Execution Output

```text
Primary color from legacy system: #FF5733
Primary color via adapter: #FF5733
```

---

## ✅ Benefits of this Approach

- **Preserves the integrity of the legacy system**
- **Reduces coupling** by introducing a translation layer
- **Supports progressive migration** to the new system
- **Isolates dependencies** without breaking functionality

---

## 📚 Reference

Gang of Four — *Design Patterns: Elements of Reusable Object-Oriented Software*  
Pattern Category: **Structural**

---

> _“Design is not just what it looks like and feels like. Design is how it works.”_  
> — Steve Jobs
