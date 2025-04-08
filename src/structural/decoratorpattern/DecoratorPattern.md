# Decorator Pattern

## When to use
* You want to dynamically add functionality to an object at run-time as an alternative for subclassing to extend functionality (because subclassing is static)

## Consequences

### Benefits
* _Open-Closed Principle_: you can add new concrete decorators by extending the base decorator instead of modifying the code in the base decorator
* _Single Responsibility Principle_: we separate the customization code from the concrete component (by making decorators), which implements the core business logic

### Liabilities
* Lots of little objects
* It's hard to implement a decorator whose behaviour doesn't depend on the order the decorators wrap around each other