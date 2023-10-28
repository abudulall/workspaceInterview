Q1: What is an Entity in Clean Architecture? ☆☆

Answer:
An Entity is an object within our software that represents the union of critical business rules operating on critical
business data (i.e. data bound to behaviour if you may). For example,the Loan entity could look like:
Loan
-principle
-rate
-period
:-----------------
+makePayment()
+applyInterest()
+chargeLateFee()
The entity should either hold the critical business data OR have very easy access to it.
The entity does not know anything about databases, user interfaces or third-party frameworks.
In an object-oriented language the entity may be a class, but in other paradigms it can be whatever
construct allows to bind data and behaviour together (all programing paradigms have this concept).

Q2: What do you understand by Clean Architecture approach? ☆☆
Answer:
The majority of architectural approaches (like Onion or Hexagonal Architecture) have this common set of
characteristics:
The architectural approach shall be:
Independent of any tech frameworks
Testable: business rules are testable without the UI, the DB, the web server, and any other external
element.
Independent of the UI: The UI can change easily with no impact on the business rules. The UI can easily
be replaced.
Independent of the database
Independent of external agents: The business rules don't know anything about interfaces to the outside
world.
The Clean Architecture is an attempt at integrating all these architectures into a single actionable idea.

Q3: How you pass data between modules where they have different models in Clean Architecture? ☆☆
Answer:
You simply use mappers. Mappers transform DTOs into domain models and vice versa. The reason to make each
module has its own models or entities is to easily test each module separately.

Q4: What do you mean by Clean Architecture is Screaming? ☆☆☆
Answer:
One aspect Uncle Bob is emphasizing is that the clean architecture is screaming. According to Uncle Bob an
architecture “screams” when it clearly expresses its core business purpose.
The top-level folder structure, the project/DLL names, and the namespaces should express business aspects
rather than frameworks or other details. That also means that the top-level structure and names should express
your business domain and not the technical details and frameworks you use.


Q5: Where should I implement the external API calls logic in Clean Architecture? ☆☆☆
Problem:
Whenever a request is made to get a "full product", the client will ping the endpoint for the full product, it will
grab that, and use its id to ping my Images and Reviews services to get all images and reviews for that product.
Where should I implement the external API calls logic in Clean Architecture?
Solution:
Obtaining the images and reviews from the perspective of your product use case is just like database access. The
only difference is that you don't query a database, you query another service instead. When you take a look at the clean architecture you will realize that the controllers and gateways are on the same architectural layer - the interface adapters. This layer is named "interface adapters" because it adapts interfaces of the lower layer.

Q6: Explain the control flow of a user interacting with Clean Architecture components? ☆☆☆
Answer:
Following the purple arrow we can see the control flow of a user interacting with a system:
1. The user interacts with the view.
2. The view creates a request (object) which is passed to the controller.
3. The controller converts the request into a request model and passes it to the use case interactor through its
input port.
4. The use case interactor processes the request model and creates a response model which is passed through
the output port to the presenter.
5. The presenter converts the response model to the view model which is then passed to the view.
6. The user sees the result of his interaction in the view

Q7: What is the difference between Request/Response Models and Entities in Clean Architecture? ☆☆☆☆
Answer:
Request and Response data structures are introduced for the use cases to get input data and return output
without coupling them to any particular type of I/O device (like the web or the DB).
These structures should not depend on anything:
They should not know about the web or the DB.
They should not know about the framework.
They should not contain references to Entity objects.
Despite probably sharing data with Entity objects, the purpose of these two objects is very
different and they will change for very different reasons. Therefore this is accidental duplication
and it is better to keep them separate.

Q8: Compare Onion vs Clean vs Hexagonal Architectures ☆☆☆☆
Answer:
Hexagonal, Onion, and Clean Architecture all center around the idea of externalizing the database and other
dependencies instead of building around them but use different terminology:
Hexagonal or “ports and adapters” architecture:
Your core application logic is written with only a concept of whatever external dependencies it has. In
object-oriented terms, this means it declares and references an interface, but leaves the implementation
of that interface out of the core logic.
This can be thought of as a “port” such as a display port or USB port. The outer layer of the application
then creates an “adapter” which plugs into the port
There are no layers.
Onion Architecture. It expanded on the idea to define a “Core”:
The core “Domain Model” represents enterprise-wide business rules.
In the next layer up are “Domain Services” such as abstract repositories (still leaving the implementation
details such as a database connection to the outer layers).
Further up is “Application Services” which defined the business processes of the application. In the outermost layer are the user interface, connections to external infrastructure, and automated tests.
There are layers, with the dependencies always pointing inwards, i.e., a layer can use any of the layers
inside it.
Clean Architecture:
Instead of “Domain Model”, it refers to the core as “Entities”
The concept of “Screaming Architecture”. It should be glaringly obvious at a glance what an application
does.
Re-phrases “Application Services” as “Use Cases”

Q9: How and where do you use transactions in the Clean Architecture? ☆☆☆☆☆
Put the transaction on the controllers. The controller knows about the larger framework since it probably has at
least metadata like annotations of the framework.
You can have each use case start a transaction and do transaction management. Internally the unit of work
either starts the actual transaction or increases a counter of invoked starts. Each use case would then call
commit or reject. When the commit count equals 0, invoke the actual commit.
