# StringBuffer and StringBuilder Common Methods

Both `StringBuffer` and `StringBuilder` classes in Java share a set of
common methods.\
Here's a quick reference table with descriptions:

  -------------------------------------------------------------------------------------
Method                                    Description
  ----------------------------------------- -------------------------------------------
`append()`                                Adds text at the end.

`insert(int index, String s)`             Inserts text at the given index.

`replace(int start, int end, String s)`   Replaces characters between start and end
with new string.

`delete(int start, int end)`              Deletes characters from start to end-1.

`reverse()`                               Reverses the sequence.

`capacity()`                              Returns the current capacity.

`length()`                                Returns the length of the string.

`charAt(int index)`                       Returns the character at given index.

`setCharAt(int index, char c)`            Replaces the character at index.

-------------------------------------------------------------------------------------

------------------------------------------------------------------------

Use **StringBuffer** when thread safety is required.\
Use **StringBuilder** when performance matters and thread safety is
not a concern.
----------------------------------------------------------------------------------------------
# Monolithic vs Microservices Architecture

## 1. Monolithic Architecture

### Definition

In **monolithic architecture**, the entire application is built as **one
single unit**.\
All features (UI, business logic, database access) are tightly
integrated into one codebase.

### How it works

-   Single codebase → deployed as a single executable or package.\
-   If you want to update one feature, you must redeploy the whole
    application.

### Example

Think of an **E-commerce app** where user login, product listing,
payment, and order management are all inside one big project.

### Advantages

-   Simple to develop and test (at small scale).\
-   Easier debugging (everything is in one place).\
-   Straightforward deployment.

### Disadvantages

-   Not scalable → difficult to handle large user loads.\
-   Slower development when app grows bigger.\
-   If one part fails, the whole system may go down.\
-   Technology stack is tightly coupled (hard to mix languages/tools).

------------------------------------------------------------------------

## 2. Microservices Architecture

### Definition

In **microservices architecture**, the application is broken down into
**small, independent services**, each responsible for a specific
function.\
These services communicate with each other using APIs (mostly REST
APIs).

### How it works

-   Each service runs independently (like **User Service, Payment
    Service, Order Service**).\
-   Services can be deployed, scaled, or updated **individually**.

### Example

An **E-commerce app** can be divided as:\
- User Service → handles login & registration.\
- Product Service → manages product catalog.\
- Cart Service → manages shopping carts.\
- Payment Service → handles transactions.

### Advantages

-   Highly scalable → scale only the service that needs more power.\
-   Independent deployment (no need to redeploy everything).\
-   Flexible technology → each service can use different
    languages/databases.\
-   Fault isolation → failure in one service doesn't crash the whole
    app.

### Disadvantages

-   More complex to design and manage.\
-   Requires DevOps, containerization (Docker, Kubernetes), API
    management.\
-   Network latency (services talk over APIs, not directly in code).
------------------------------------------------------------------------------
