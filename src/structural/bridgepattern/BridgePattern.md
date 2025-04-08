# Bridge Pattern

## When to use
* You want to decouple an abstraction from its implementation.

## Consequences

### Benefits
* Client isn't exposed to low-level details, and only works with high-level abstractions
* _Single Responsiblity Principle_: the abstraction handles high-level logic, while the implementation handles the lower-level work
* _Open/Closed Principle_: a new implementation can be introduced without changing the abstraction's code. There is also an option for a refined abstraction by extending the abstraction

### Liabilities
* Might make the code more complicated by applying the pattern to an already highly cohesive class (just don't then)