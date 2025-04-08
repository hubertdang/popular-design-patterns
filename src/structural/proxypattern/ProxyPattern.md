# Proxy Pattern

## When to use
* You want to provide a surrogate/placeholder for another object to control access to it

## Consequences

### Benefits
* _Open-Closed Principle_: you can add new proxies wtihout changing the service or clients
* We can limit the use of a resource-intensive service to only when necessary by using the proxy to cache stuff for example
* If the service isn't available, the proxy still works, so if there's any data cached by the proxy, the proxy can provide that instead of accessing the service

### Liabilities
* Lots of little objects
* It's hard to implement a decorator whose behaviour doesn't depend on the order the decorators wrap around each other