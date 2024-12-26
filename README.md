Cucumber Selenium Java Project

[![Java CI with Maven](https://github.com/SanghamitraBhowmick1993/cucumberjavaarchitecture/actions/workflows/e2eflow.yml/badge.svg)](https://github.com/SanghamitraBhowmick1993/cucumberjavaarchitecture/actions/workflows/e2eflow.yml)

Welcome to the Cucumber Selenium Java Project! This repository is a robust test automation framework for end-to-end testing of web applications. It integrates Cucumber for Behavior-Driven Development (BDD) and Selenium WebDriver for browser-based testing.

📋 Features
BDD Style Testing: Write tests in simple, human-readable Gherkin syntax.
Cross-Browser Support: Run tests on multiple browsers, including Chrome, Firefox, and Edge.
Screenshot Capture: Automatically capture screenshots for passed and failed steps.
Parallel Execution: Speed up testing with parallel execution support.
Detailed Reporting: Generate detailed HTML reports using ExtentReports.
Configurable Setup: Easy to configure properties for browser, URL, and other parameters.
🚀 Technologies Used
Java: Programming language for test scripts.
Cucumber: Framework for BDD.
Selenium WebDriver: For browser automation.
Maven: Build and dependency management.
ExtentReports: For generating detailed test execution reports.
🛠️ Prerequisites
Before running the project, ensure you have the following installed:

Java JDK 8+
Maven 3.6+
Chrome/Firefox/Edge browsers installed
IDE: IntelliJ IDEA, Eclipse, or any preferred Java IDE.
⚙️ Setup Instructions
1. Clone the Repository
bash
Copy code
git clone https://github.com/your-repo-name.git
cd your-repo-name
2. Install Dependencies
Run the following command to install Maven dependencies:

bash
Copy code
mvn clean install
3. Configure config.properties
Update the configuration file located at src/test/resources/config.properties:

properties
Copy code
browser=chrome
url=https://example.com
4. Run Tests
Run All Tests:
bash
Copy code
mvn test
Run Tests for a Specific Tag:
bash
Copy code
mvn test -Dcucumber.filter.tags="@smoke"
🧪 Writing Test Cases
Gherkin Syntax
Feature files are written in Gherkin syntax under the src/test/resources/features directory. Example:

gherkin
Copy code
Feature: Login Feature

  Scenario: Login with valid credentials
    Given user is on login page
    When user enters username as "validUser"
    And user enters password as "validPassword"
    Then user should see the dashboard
Step Definitions
Step definitions link the Gherkin steps to Java methods. These are in the src/test/java/stepDefinitions directory:

java
Copy code
@Given("user is on login page")
public void user_is_on_login_page() {
    driver.get("https://example.com/login");
}
📊 Reporting
After running the tests, a detailed report is generated in the test-output/SparkReport directory. Open Spark.html in your browser to view the results.

🤝 Contributing
Contributions are welcome! To contribute:

Fork the repository.
Create a new branch:
bash
Copy code
git checkout -b feature/your-feature-name
Commit your changes:
bash
Copy code
git commit -m "Add your message here"
Push the branch:
bash
Copy code
git push origin feature/your-feature-name
Create a Pull Request.
🐞 Troubleshooting
Common Issues
Browser Version Mismatch: Ensure that the ChromeDriver/GeckoDriver version matches the installed browser version.

Dependencies Not Downloading: Run mvn clean install -U to force update dependencies.

Failed Tests: Check the Spark.html report for detailed failure analysis.

📖 Resources
Selenium Documentation
Cucumber Documentation
ExtentReports Documentation
📝 License
This project is licensed under the MIT License.

💬 Support
For any issues or inquiries, feel free to create an issue in this repository or contact sanghamitra.bh@gmail.com

Happy Testing! 🎉
