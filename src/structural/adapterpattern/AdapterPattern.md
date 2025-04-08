# Adapter Pattern

## When to use
* You want to allow classes with incompatible interfaces to work together

## Consequences

### Benefits
* _Single Responsiblity Principle_: the adapter handles the conversion code, while the service handles the actual business logic
* _Open/Closed Principle_: the client's code does not need to be modified to add a new adapter into the program

### Liabilities
* Increased complexity from introducing more classes and interfaces
* Class adapter requires multiple inheritance