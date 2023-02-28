Detailed explanation for Project-06

This project is BDD Framework with a programming language Java and Maven as a build tool.
I used SeleniumWebDriver and WebDriverManager to automate my web browser testing.
My framework integrated with JUnit for the Annotations to control test flow, Assertions for verification, and reports.
I also implemented POM and Singleton design patterns and used OOP principles.
I centralized all web elements and page related methods in object repositories using PageFactory Class.
Singleton allowed me to create a single driver instance across my framework.
With the help of Maven, I've achieved such a structure of folders and packages, it also helped me to keep my classes organized. 
In Maven pom.xml file I stored all plugins,libraries, dependencies, profiles, versions.
And all reports are stored in Target folder provided by Maven. 
With Maven-Surefire-Plugin I can execute the specific suites with tags
For example for executing my Smoke Suite, above of each test I placed @Smoke annotation(provided by JUnit), 
and with COMMAND: mvn clean test -Dcucumber.options="--tags @Smoke" I easily execute my Smoke Suite
And with my Regression Suite I do the same, just instead of @Smoke annotation I use @Regression(provided by JUnit), 
and run COMMAND: mvn clean test -Dcucumber.options="--tags @Regression".
This command will first visit the pom.xml goal and then the Runner class. If runner class have a different tag,
it will be updated with a given suite tag, now it will go to feature file and will start execute all the scenarios that have the same tag.
Scenario steps will be executed with their linked implementation in the "steps" package.
After execution is done reports will be generated and stored under the target folder.
In my Hooks Class where I keep my @After annotation to quit my driver that run after each scenario.
In the Runner class that I linked with my feature file and their step implementation, in order to run scenarios.
I can also run my test suit in the Runner class with specify tag (and so as the scenario(s)) I want to execu

<img width="1311" alt="Screen Shot 2023-02-28 at 1 50 51 PM" src="https://user-images.githubusercontent.com/116601393/221963586-f1e64059-9e07-4493-80c7-102d97a72fec.png">
