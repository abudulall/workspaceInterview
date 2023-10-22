Q1: What is Availability? ☆
Answer:
Availability refers to the probability that a system_ performs correctly at a specific time instance_ (not
duration). Interruptions may occur before or after the time instance for which the system’s availability is
calculated. The service must be operational and adequately satisfy the defined specifications at the time of its
usage.
Availability is often quantified by uptime (or downtime) as a percentage of time the service is available.
Availability is generally measured in number of 9s--a service with 99.99% availability is described as having four
9s.

Q2: What is Reliability?
Answer:
Reliability is the probability that a system performs correctly during a specific time duration. During this correct
operation, no repair is required or performed, and the system adequately follows the defined performance
specifications.
Reliability follows an exponential failure law, which means that it reduces as the time duration considered for
reliability calculations elapses. In other words, reliability of a system will be high at its initial state of operation
and gradually reduce to its lowest magnitude over time.

Q3: What Do You Mean By High Availability (HA)?
Answer:
Availability means the ability of the application user to access the system, If a user cannot access the
application, it is assumed unavailable. High Availability means the application will be available, without
interruption. Using redundant server nodes with clustering is a common way to achieve higher level of
availability in web applications.
Availability is commonly expressed as a percentage of uptime in a given year.

Q4: How Do you update a live heavy traffic site with minimum or Zero Down Time?
Answer:
Deploying a newer version of a live website can be a challenging task specially when a website has high traffic.
Any downtime is going to affect the users. There are a few best practices that we can follow:
Before deploying on Production:
Thoroughly test the new changes and ensure it working in a test environment which is almost identical to
production system.
If possible do automation of test cases as much as possible.
Create a automated sanity testing script (also called as smoke test) that can be run on production (without
affecting real data). These are typically readonly type of test cases. However depending on your application
needs you can add more cases to this. Make sure it can be run quickly by keeping it short.
Create scripts for all manual tasks(if possible), avoiding any hand typing mistakes during day of deployment.
Test the script to make sure they work on a non-production environment.
Keep the build artifacts ready. e.g application deployment files, database scripts, config files etc.
Create a checklist of things to do on day of deployment.
Rehearse. Deploy in a non-prod environment is almost identical to production. Try this with production data
volumes(if possible). Make a note of time required for your tasks so you can plan accordingly.
When doing deploying on a production environment:*
Use Green-Blue deployment technique to reduce down-time risk
Keep backup of current site/data to be able to rollback
Use sanity test cases before doing a lot of in depth testing

Q5: What is Fail-over?
Answer:
In computing and related technologies such as networking, failover is switching to a redundant or standby
computer server, system, hardware component or network upon the failure or abnormal termination of the
previously active application,[1] server, system, hardware component, or network.
Failover is a means of achieving high availability (HA). Think of HA as a feature and failover as one possible
implementation of that feature. Failover is not always the only consideration when achieving HA.
There are two complementary patterns to support high availability: fail-over and replication.

Q6: Explain Failure in contrast to Error
Answer:
A failure is an unexpected event within a service that prevents it from continuing to function normally. A
failure will generally prevent responses to the current, and possibly all following, client requests.
This is in contrast with an error, which is an expected and coded-for condition—for example an error
discovered during input validation, that will be communicated to the client as part of the normal processing
of the message.
Failures are unexpected and will require intervention before the system can resume at the same level of
operation. This does not mean that failures are always fatal, rather that some capacity of the system will be
reduced following a failure. Errors are an expected part of normal operations, are dealt with immediately and the
system will continue to operate at the same capacity following an error.

Q7: How to choose between CP (consistency) and AP (availability)?
Answer:
You need consistency (or what is called a CP database) if the data in the database must always be up to
date and aligned, even in the instance of a network failure (eg. the partitioned nodes are unable to
communicate with one another for whatever reason).
Particular use cases where you would prioritize consistency is when you need multiple clients to have the
same view of the data. For example, where you’re dealing with financial information, personal information,
using a database that gives you consistency and confidence that data you are looking at is up to date in a
situation where the network is unreliable or fails.
You need availability when data accumulation is a priority. In scenarios like these, you will want to capture
as much information as possible, but it isn’t critical that the database is constantly up to date. It simply just
needs to be accessible and available even when network connections aren’t working.

Q8: Explain how does Active-Passive Fail-over work?
Answer:
With active-passive fail-over, heartbeats are sent between the active and the passive server on standby. If the
heartbeat is interrupted, the passive server takes over the active's IP address and resumes service.
The length of downtime is determined by whether the passive server is already running in 'hot' standby or
whether it needs to start up from 'cold' standby. Only the active server handles traffic.
Active-passive failover can also be referred to as master-slave failover.

Q9: What is Active-Active Fail-over?
Answer:
In active-active, both servers are managing traffic, spreading the load between them.
If the servers are public-facing, the DNS would need to know about the public IPs of both servers. If the servers
are internal-facing, application logic would need to know about both servers.
Active-active failover can also be referred to as master-master failover.

Q10: Compare "Fail Fast" vs "Robust" approaches of building software
Answer:
Some people recommend making your software robust by working around problems automatically. This results
in the software “failing slowly.” The program continues working right after an error but fails in strange ways later
on.
A system that fails fast does exactly the opposite: when a problem occurs, it fails immediately and visibly.
Failing fast is a nonintuitive technique: “failing immediately and visibly” sounds like it would make your software
more fragile, but it actually makes it more robust. Bugs are easier to find and fix, so fewer go into production.
In overall, the quicker and easier the failure is, the faster it will be fixed. And the fix will be simpler and also more
visible. Fail Fast is a much better approach for maintainability.

Q11: Explain how to calculate Availability of multiple system components
Answer:
If a service consists of multiple components prone to failure, the service's overall availability depends on whether
the components are in sequence or in parallel.
In sequence
Overall availability decreases when two components with availability < 100% are in sequence:
Availability (Total) = Availability (Foo) * Availability (Bar)
If both Foo and Bar each had 99.9% availability, their total availability in sequence would be 99.8% .
In parallel
Overall availability increases when two components with availability < 100% are in parallel:
Availability (Total) = 1 - (1 - Availability (Foo)) * (1 - Availability (Bar))
If both Foo and Bar each had 99.9% availability, their total availability in parallel would be 99.9999% .

Q12: What is a crashloop?
Answer:
A crashloop is when a process crashes and is restarted by a watchdog daemon, indefinitely.
That is, the history is:
Process starts at time T.
Process crashes at time T+1.
Watchdog daemon restarts process.
Process started at time T+2.
Process crashes at time T+3.
Watchdog daemon restarts process.
Process starts...etc.
In general, in distributed computing if you want something to eventually succeed, you have to write down your
intent for it to be completed and you need a worker to loop continually to act on this intent. This is "at least once
delivery" of a work item.
Here, the intent is that the task runs, and watchdog itself is running the loop that is constantly trying to make
sure the task runs. This is why when a task crashes, it is restarted. When a task crashes repeatedly, together you
end up with a crashloop
