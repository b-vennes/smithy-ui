# Smithy UI

The goal of this project is to provide an elegant UI that can be hooked up to any service defined in Smithy and provide a frontend for an interface.  The intention is that this tool could make presenting backend code easier and make demoing new functions / libraries more engaging for viewers.

For example, giving the following Smithy service:

```Smithy
$version: "2"
namespace example

structure OrderPizzaInput {
    description: String 
}

structure Receipt {
    date: String
    price: Integer
    description: String
}

operation OrderPizza {
    input: OrderPizzaInput
    output: Receipt
}

service PizzaService {
    operations: [OrderPizza]
}
```

An interface could be derived which looks kinda like:

```text
 ---------------------------
| Pizza Service             |
|---------------------------|
| Order Pizza               |
| -----                     |
| Description               |
| | your desc here |        |
|                           |
| [send]                    |
|                           |
| Result                    |
| ----                      |
| Receipt [                 |
|   date: ...               |
|   price: ...              |
|   description: ...        |
| ]                         |
|                           |
 ---------------------------
```

without the user needing to write any front-end code.
