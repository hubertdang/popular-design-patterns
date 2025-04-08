# Composite Pattern

## When to use
* You want clients to treat composite and leaf elements in a tree structure the same way.

## Consequences

### Benefits
* _Open/Closed Principle_: leaf components are open for extension to create subtypes of leaf components without breaking the existing code
* Good for complex tree structures

### Liabilities
* Can make your design overly general
* Difficult to provide a common interface for classes whose functionality differs too much