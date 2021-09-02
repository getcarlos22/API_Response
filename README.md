# API Response
[![CircleCI](https://circleci.com/gh/getcarlos22/API_Response.svg?style=svg)](https://circleci.com/gh/getcarlos22/API_Response)
## About
A small library that will be used to compare API Responses.<br/> The 2 files can take millions of HTTP requests, separated by new line.<br/>The Comparison function checks the JSON responses.

## Dependencies
Here are the dependencies used in the project for development & testing perspective.

* [Java 1.8](https://www.java.com/en/) - Coding Language
* [Maven](https://maven.apache.org/) - Dependency Management
* [RestAssured](http://rest-assured.io/) - Used to get API Response
* [json](https://mvnrepository.com/artifact/org.json/json) - JSON encoders/decoders in Java
* [TestNG](https://testng.org/) - Testing framework inspired from JUnit and NUnit

##Functionalities
* Testing with two files containing request URLs in each files.
* Compare response and indicate response
* json comparison based on inner/nested key and value
* Access report target/surefire-reports or test-output (listeners enabled)
* Support for parallel execution with testng.xml
* Increment JAVA heap size to handle a million requests (e.g. -Xmx512M)


## Getting Started
* Import project to IDE (Intellij recommended)
* Set-Up Run config
* Run testng Suite

## Alternatively
```
1) Open your terminal and do a clone of this project.
2) Navigate to the respective directory and run below command.
   mvn clean install
3) Above command will build the project along with test cases. 
````
````
[INFO] ------------------------------------------------------------------------
[INFO]  T E S T S
[INFO] ------------------------------------------------------------------------

[INFO] Results:
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------