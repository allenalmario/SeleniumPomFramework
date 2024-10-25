### SELENIUM + CUCUMBER BDD PAGE OBJECT MODEL TEST AUTOMATION FRAMEWORK
## By Allen Almario - SDET II

This is a Page Object Model Test Automation Framework using Selenium with Java and Cucumber BDD. It uses TestNG to run the tests and uses Extent Report to generate test result reports. It also utilizes GitHub actions
for an easy "push of a button" mechanism to run the automated tests and publish the test report on GitHub.

## Dependencies needed
- Selenium
- Cucumber Java
- Cucumber TestNG
- Extent Reports Cucumber Adapter
- Lombok

## How to run this project

### GitHub Actions
- Go to Actions
- Click on the ""
- Select Run workflow
- Ensure branch is set to "main"
- Click Run workflow

### Locally on Terminal/Command Prompt
Run the following:

```
mvn clean test
```

## Where are reports saved

### GitHub Page


### Locally
After tests are executed, an Extent Report with test results should be saved in the directory
./target/extent-reports/extent.html

*This project was built with the guidance of the Udemy course "Master Microsoft Playwright with Core Java". [CLICK HERE](https://www.udemy.com/course/playwright-java-tutorial/) to check out the course.*