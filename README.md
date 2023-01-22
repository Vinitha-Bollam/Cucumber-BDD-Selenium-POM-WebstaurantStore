# Cucumber-BDD-Selenium-Page-Object-Model

Test scenario:

1. Go to "https://www.webstaurantstore.com/"
2. Search for "stainless work table".
3. Check the search result ensuring every product has the word "Table" in its title.
4. Add the last of found items to Cart.
5. Empty Cart.

Created a Jenkins Job to quickly run the Cucumber tag on Jenkins. Here is the 
**Jenkins Console** [JenkinsConsole_Cucumber-BDD-Selenium-POM-WebstaurantStore.txt](https://github.com/Vinitha-Bollam/Cucumber-BDD-Selenium-POM-WebstaurantStore/files/10430119/JenkinsConsole_Cucumber-BDD-Selenium-POM-WebstaurantStore.txt)

![image](https://user-images.githubusercontent.com/108022872/212783877-9e121d86-222f-4d9e-9758-b48dfdeddd30.png)
![image](https://user-images.githubusercontent.com/108022872/212783960-4a284dad-aa6c-4a27-892d-e74fa424d7af.png)
![image](https://user-images.githubusercontent.com/108022872/212784022-c4e779d4-2439-40fe-8557-4558306aef29.png)
![image](https://user-images.githubusercontent.com/108022872/212784093-94f1562f-b5b9-4ee3-bdf6-e9b85e3755fa.png)
![image](https://user-images.githubusercontent.com/108022872/212784141-a82d1f22-d1f3-4973-b95d-e96b1c6745a1.png)
![image](https://user-images.githubusercontent.com/108022872/212784173-fca683db-6e6e-4a5e-a496-22c5c550fcf2.png)


Info from official site https://cucumber.io/docs/bdd/ 

**What is BDD?**

BDD is a way for software teams to work that closes the gap between business people and technical people by:

Encouraging collaboration across roles to build shared understanding of the problem to be solved
Working in rapid, small iterations to increase feedback and the flow of value
Producing system documentation that is automatically checked against the system’s behaviour
We do this by focusing collaborative work around concrete, real-world examples that illustrate how we want the system to behave. We use those examples to guide us from concept through to implementation, in a process of continuous collaboration.

**BDD and agile**
We assume that your team are using some kind of agile methodology already, planning work in small increments of value like User Stories. BDD does not replace your existing agile process, it enhances it.

Think of BDD as a set of plugins for your existing process that will make your team more able to deliver on the promises of agile: timely, reliable releases of working software that meets your organisation’s evolving needs, requiring some maintenance effort and discipline.

**Rapid iterations**
We assume you would like to be able to respond quickly to feedback from your users, and do only the minimal work necessary to meet those needs.

BDD encourages working in rapid iterations, continuously breaking down your user’s problems into small pieces that can flow through your development process as quickly as possible.

**Three practices**
Essentially, day-to-day BDD activity is a three-step, iterative process:

**First,** take a small upcoming change to the system – a User Story – and talk about concrete examples of the new functionality to explore, discover and agree on the details of what’s expected to be done.<br />
**Next,** document those examples in a way that can be automated, and check for agreement.<br />
**Finally,** implement the behaviour described by each documented example, starting with an automated test to guide the development of the code.
The idea is to make each change small and iterate rapidly, moving back up a level each time you need more information. Each time you automate and implement a new example, you’ve added something valuable to your system, and you’re ready to respond to feedback.<br />

We call these practices Discovery, Formulation, and Automation.

diagram of how the practices fit together
Discovery, Formulation and Automation
Over time, the documented examples become an asset that enables your team to continue confidently and rapidly making changes to the system. The code reflects the documentation, and the documentation reflects the team’s shared understanding of the problem domain. This shared understanding is constantly evolving.

There’s lots to learn about each of these practices. We’ll summarise each of them below.

**Discovery: What it could do**
The hardest single part of building a software system is deciding precisely what to build.

– Fred Brooks, The mythical man-month

Although documentation and automated tests are produced by a BDD team, you can think of them as nice side-effects. The real goal is valuable, working software, and the fastest way to get there is through conversations between the people who are involved in imagining and delivering that software.

BDD helps teams to have the right conversations at the right time so you minimise the amount of time spent in meetings and maximising the amount of valuable code you produce.

We use structured conversations, called discovery workshops, that focus around real-world examples of the system from the users' perspective. These conversations grow our team’s shared understanding of the needs of our users, of the rules that govern how the system should function, and of the scope of what needs to be done.

It may also reveal gaps in our understanding, where we need more information before we know what to do.

The scrutiny of a discovery session often reveals low-priority functionality that can be deferred from the scope of a user story, helping the team to work in smaller increments, improving their flow.

If you’re new to BDD, discovery is the right place to start. You won’t get much joy from the other two practices until you’ve mastered discovery.

**Formulation: What it should do**
As soon as we have identified at least one valuable example from our discovery sessions, we can now formulate each example as structured documentation. This gives us a quick way to confirm that we really do have a shared understanding of what to build.

In contrast to traditional documentation, we use a medium that can be read by both humans and computers, so that:

We can get feedback from the whole team about our shared vision of what we’re building.
We’ll be able to automate these examples to guide our development of the implementation.
By writing this executable specification collaboratively, we establish a shared language for talking about the system. This helps us to use problem-domain terminology all the way down into the code.

**Automation: What it actually does**
Now that we have our executable specification, we can use it to guide our development of the implementation.

Taking one example at a time, we automate it by connecting it to the system as a test. The test fails because we have not implemented the behaviour it describes yet. Now we develop the implementation code, using lower-level examples of the behaviour of internal system components to guide us as required.

The automated examples work like guide-rails, helping us to keep our development work on track.

When we need to come back and maintain the system later, the automated examples will help us to understand what the system is currently doing, and to make changes safely without unintentionally breaking anything.

This rapid, repeatable feedback reduces the burden of manual regression testing, freeing people up to do more interesting work, like exploratory testing.

**Advantages of the BDD Framework:**

**Collaboration:** BDD scenarios are written in plain English, which is easy to understand by everyone involved in the project, from stakeholders to project team members.<br />
**Clarity of Scenarios:** Scenarios are written specifically to each functionality which gives clarity for product development and testing.<br />
**Identifying Functionalities:** Be it manual or automated, testing becomes very easy as the test cases or the test scripts can be easily identified from the feature files.<br />
**Maintenance:** The maintenance of the framework is simple.<br />
**Documentation:** BDD also acts as project live documentation for all modules and functionalities.<br />
**Parallel execution:** A user can parameterize the gherkin steps in the feature file to obtain reusability of the scenario using Scenario Outline and Examples.<br />
**Rerun Failed scenarios:** Cucumber provides an option to run the failed test scenarios automatically.<br />
**Cucumber Integration and reporting:** Cucumber also supports working with Jenkins. You can run the cucumber test execution in Jenkins. The cucumber reporting plugin also provides users with an expanded view to track test scenarios using HTML format.<br />

