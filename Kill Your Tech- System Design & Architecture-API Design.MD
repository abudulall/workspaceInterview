Q1: What is API Design? ☆
Topics: API Design
Answer:
API design is the process of building an intermediary interface for a system to system connection to expose
data to application users and developers.
The fundamental API design influences how well users can consume it and the general user experience. This
development process does not allow a single approach. Instead, it combines a series of guidelines to meet initial
expectations and continue to work consistently. Application programming interface designers closely follow
industry best practices, design patterns, API design principles, and user needs to develop software that presents
excellent functionality.
Q2: What is SOAP? ☆☆
Topics: SOA API Design
Answer:
SOAP stands for Simple Object Access Protocol. SOAP is an XML based industry standard protocol for designing
and developing web services. Since it’s XML based, it’s platform and language independent. So our server can be
based on JAVA and client can be on .NET, PHP etc. and vice versa.
Q3: What are advantages of REST web services? ☆☆
Topics: API Design REST & RESTful
Answer:
Some of the advantages of REST web services are:
Learning curve is easy since it works on HTTP protocol
Supports multiple technologies for data transfer such as text, xml, json, image etc.
No contract defined between server and client, so loosely coupled implementation.
REST is a lightweight protocol
REST methods can be tested easily over browser.
Q4: Mention some key characteristics of REST? ☆☆
Topics: API Design REST & RESTful
Answer:
Some key characteristics of REST includes
REST is stateless, therefore the SERVER has no state (or session data)
Page 1 of 7
FullStack.Cafe - Kill Your Tech Interview
With a well-applied REST API, the server could be restarted between two calls as every data is passed to the
server
Web service mostly uses POST method to make operations, whereas REST uses GET to access resources
Q5: What are disadvantages of SOAP Web Services? ☆☆☆
Topics: SOA API Design
Answer:
Some of the disadvantages of SOAP protocol are:
Only XML can be used, JSON and other lightweight formats are not supported.
SOAP is based on the contract, so there is a tight coupling between client and server applications.
SOAP is slow because payload is large for a simple string message, since it uses XML format.
Anytime there is change in the server side contract, client stub classes need to be generated again. Can’t be
tested easily in browser
Q6: What are disadvantages of REST web services? ☆☆☆
Topics: API Design REST & RESTful
Answer:
Some of the disadvantages of REST are:
Since there is no contract defined between service and client, it has to be communicated through other
means such as documentation or emails.
Since it works on HTTP, there can’t be asynchronous calls.
Sessions can’t be maintained.
Q7: How would you choose between SOAP and REST web services?
☆☆☆
Topics: SOA API Design
Answer:
Web Services work on client-server model and when it comes to choose between SOAP and REST, it all depends
on project requirements. Let’s look at some of the conditions affecting our choice:
Do you know your web service clients beforehand? If Yes, then you can define a contract before
implementation and SOAP seems better choice. But if you don’t then REST seems better choice because you
can provide sample request/response and test cases easily for client applications to use later on.
How much time you have? For quick implementation REST is the best choice. You can create web service
easily, test it through browser/curl and get ready for your clients. What kind of data format are supported? If
only XML then you can go with SOAP but if you think about supporting JSON also in future then go with REST.
Q8: What are the primary security issues of web service? ☆☆☆
Topics: API Design
Page 2 of 7
FullStack.Cafe - Kill Your Tech Interview
Answer:
To ensure reliable transactions and secure confidential information, web services requires very high level of
security which can be only achieved through Entrust Secure Transaction Platform. Security issues for web
services are broadly divided into three sections as described below
1) Confidentiality: A single web service can have multiple applications and their service path contains a
potential weak link at its nodes. Whenever messages or say XML requests are sent by the client along with the
service path to the server, they must be encrypted. Thus, maintaining the confidentiality of the communication is
a must.
2) Authentication: Authentication is basically performed to verify the identity of the users as well as ensuring
that the user using the web service has the right to use or not? Authentication is also done to track user’s
activity. There are several options that can be considered for this purpose
Application level authentication
HTTP digest and HTTP basic authentication
Client certificates
3) Network Security: This is a serious issue which requires tools to filter web service traffic.
Q9: What is difference between SOA and Web Services? ☆☆☆☆
Topics: SOA API Design
Answer:
Service Oriented Architecture (SOA) is an architectural pattern where applications are designed in terms of
services that can be accessed through communication protocol over network. SOA is a design pattern and
doesn’t go into implementation.
Web Services can be thought of as Services in SOAP architecture and providing means to implement SOA
pattern.
Q10: What are the advantages of statelessness in RESTful
Webservices? ☆☆☆☆
Topics: API Design REST & RESTful
Answer:
Following are the benefits of statelessness in RESTful web services:
Web services can treat each method request independently.
Web services need not to maintain client's previous interactions. It simplifies application design.
As HTTP is itself a statelessness protocol, RESTful Web services work seamlessly with HTTP protocol.
Q11: Explain Cache-control header ☆☆☆☆
Topics: API Design
Answer:
Page 3 of 7
FullStack.Cafe - Kill Your Tech Interview
A standard Cache control header can help in attaining cache ability. Enlisted below is the brief description of
various cache control header:
Public: Resources that are marked as the public can be cached by any intermediate components between
the client and server.
Private: Resources that are marked as private can only be cached by the client.
No cache means that particular resource cannot be cached and thus the whole process is stopped.
Q12: Explain what is the API Gateway pattern ☆☆☆☆
Topics: Microservices API Design
Answer:
An API Gateway is a server that is the single entry point into the system. It is similar to the Facade pattern from
object‑oriented design. The API Gateway encapsulates the internal system architecture and provides an API that
is tailored to each client. It might have other responsibilities such as authentication, monitoring, load balancing,
caching, request shaping and management, and static response handling.
A major benefit of using an API Gateway is that it encapsulates the internal structure of the application. Rather
than having to invoke specific services, clients simply talk to the gateway.
Q13: What are the best practices to be followed while designing a
secure RESTful web service? ☆☆☆☆☆
Topics: API Design REST & RESTful
Answer:
As RESTful web services work with HTTP URLs Paths so it is very important to safeguard a RESTful web service in
the same manner as a website is be secured. Following are the best practices to be followed while designing a
RESTful web service:
Validation − Validate all inputs on the server. Protect your server against SQL or NoSQL injection attacks.
Session based authentication − Use session based authentication to authenticate a user whenever a
request is made to a Web Service method.
No sensitive data in URL − Never use username, password or session token in URL , these values should
be passed to Web Service via POST method.
Restriction on Method execution − Allow restricted use of methods like GET, POST, DELETE. GET method
should not be able to delete data.
Validate Malformed XML/JSON − Check for well formed input passed to a web service method.
Throw generic Error Messages − A web service method should use HTTP error messages like 403 to show
access forbidden etc.
Q14: What is Open API Initiative? ☆☆☆☆☆
Topics: API Design
Answer:
The Open API Initiative was created by an industry consortium to standardize REST API descriptions across
vendors. As part of this initiative, the Swagger 2.0 specification was renamed the OpenAPI Specification (OAS)
and brought under the Open API Initiative.
Page 4 of 7
FullStack.Cafe - Kill Your Tech Interview
You may want to adopt OpenAPI for your web APIs. Some points to consider:
The OpenAPI Specification comes with a set of opinionated guidelines on how a REST API should be designed.
That has advantages for interoperability, but requires more care when designing your API to conform to the
specification.
OpenAPI promotes a contract-first approach, rather than an implementation-first approach. Contract-first
means you design the API contract (the interface) first and then write code that implements the contract.
Tools like Swagger can generate client libraries or documentation from API contracts. For example, see
ASP.NET Web API Help Pages using Swagger.
Q15: Name some best practices for better RESTful API design
☆☆☆☆☆
Topics: API Design REST & RESTful
Answer:
Use nouns and HTTP methods but no verbs
GET /cars
POST /cars
DELETE /cars/:id
instead
GET /getAllCars
POST /createNewCar
GET /deleteAllRedCars
GET method and query parameters should not alter the state
Use plural nouns
/cars instead of /car
/users instead of /user
/products instead of /product
/settings instead of /setting
Use sub-resources for relations
GET /cars/711/drivers/ Returns a list of drivers for car 711
GET /cars/711/drivers/4 Returns driver #4 for car 711
Use HTTP headers for serialisation formats
Content-Type defines the request format.
Accept defines a list of acceptable response formats.
Use HATEOAS - Hypermedia as the Engine of Application State is a principle that hypertext links should be
used to create a better navigation through the API.
{
"id": 711,
"manufacturer": "bmw",
"model": "X5",
Page 5 of 7
FullStack.Cafe - Kill Your Tech Interview
"seats": 5,
"drivers": [{
"id": "23",
"name": "Stefan Jauker",
"links": [{
"rel": "self",
"href": "/api/v1/drivers/23"
}]
}]
}
Use appropriate HTTP response status codes
2xx (Success category)
3xx (Redirection Category)
4xx (Client Error Category)
5xx (Server Error Category)
Provide filtering, sorting, field selection and paging for collections
GET /cars?color=red Returns a list of red cars
GET /cars?seats<=2 Returns a list of cars with a maximum of 2 seats
Version your API
/blog/api/v1
Use error payloads - All exceptions should be mapped in an error payload.
{
"errors": [{
"userMessage": "Sorry, the requested resource does not exist",
"internalMessage": "No car found in the database",
"code": 34,
"more info": "http://dev.mwaysolutions.com/blog/api/v1/errors/12345"
}]
}
Allow overriding HTTP method
In certain situations (for example, when the service or its consumers are behind an overzealous corporate
firewall, or if the main consumer is a web page), only the GET and POST HTTP methods might be available.
In such a case, it is possible to emulate the missing verbs by passing a custom header in the requests. To
support a RESTful API with these limitations, the API needs a way to override the HTTP method and use the
custom HTTP Header X-HTTP-Method-Override to map the request to an appropriate API method.
Q16: Explain the difference between WCF, Web API, WCF REST and
Web Service? ☆☆☆☆☆
Topics: API Design ASP.NET Web API REST & RESTful
Answer:
Page 6 of 7
FullStack.Cafe - Kill Your Tech Interview
The .Net framework has a number of technologies that allow you to create HTTP services such as Web Service,
WCF and now Web API. There are a lot of articles over the internet which may describe to whom you should use.
Web Service
It is based on SOAP and return data in XML form.
It support only HTTP protocol.
It is not open source but can be consumed by any client that understands xml.
It can be hosted only on IIS.
WCF
It is also based on SOAP and return data in XML form.
It is the evolution of the web service(ASMX) and support various protocols like TCP, HTTP, HTTPS, Named
Pipes, MSMQ.
The main issue with WCF is, its tedious and extensive configuration.
It is not open source but can be consumed by any client that understands xml.
It can be hosted with in the applicaion or on IIS or using window service.
WCF Rest
To use WCF as WCF Rest service you have to enable webHttpBindings.
It support HTTP GET and POST verbs by [WebGet] and [WebInvoke] attributes respectively.
To enable other HTTP verbs you have to do some configuration in IIS to accept request of that particular verb
on .svc files
Passing data through parameters using a WebGet needs configuration. The UriTemplate must be specified.
It support XML, JSON and ATOM data format.
Web API
This is the new framework for building HTTP services with easy and simple way.
Web API is open source an ideal platform for building REST-ful services over the .NET Framework.
Unlike WCF Rest service, it use the full feature of HTTP (like URIs, request/response headers, caching,
versioning, various content formats)
It also supports the MVC features such as routing, controllers, action results, filter, model binders, IOC
container or dependency injection, unit testing
Page 7 of 7
