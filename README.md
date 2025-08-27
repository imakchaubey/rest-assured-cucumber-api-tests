\# 🌐 REST Assured Cucumber API Testing Framework



A robust API automation framework using REST Assured, Cucumber BDD, and Java for comprehensive endpoint testing and validation.



\## 🎯 Project Overview



This framework provides automated testing for RESTful APIs with:

\- GET and POST request validation

\- Dynamic JSON payload generation

\- Comprehensive response assertions

\- BDD-style test scenarios



\## 🛠️ Technology Stack



\- \*\*Java\*\* - Programming language

\- \*\*REST Assured\*\* - API testing library

\- \*\*Cucumber\*\* - BDD framework

\- \*\*JUnit\*\* - Test runner

\- \*\*Jackson\*\* - JSON processing

\- \*\*Maven\*\* - Build management



\## 🏗️ Project Structure

src/test/java/

├── stepDefinitions/

│ └── ApiStepDefinitions.java # API step definitions

├── runners/

│ └── TestRunner.java # Cucumber test runner

└── utils/

└── ApiUtils.java # Utility classes



src/test/resources/

└── features/

└── api\_testing.feature # BDD scenarios





\## ✨ Key Features



\- ✅ \*\*BDD Test Scenarios\*\* - Gherkin syntax for clear test cases

\- ✅ \*\*Dynamic Payloads\*\* - Flexible JSON request generation

\- ✅ \*\*Comprehensive Validation\*\* - Headers, status codes, response body

\- ✅ \*\*Type Safety\*\* - Robust handling of different data types

\- ✅ \*\*Detailed Reporting\*\* - HTML and JSON test reports

\- ✅ \*\*Easy Maintenance\*\* - Modular and scalable architecture



\## 🚀 Getting Started



\### Prerequisites



\- Java 11 or higher

\- Maven 3.6+

\- Internet connection for API calls



\### Installation



1\. Clone the repository:

git clone https://github.com/YOUR\_USERNAME/rest-assured-cucumber-api-tests.git

cd rest-assured-cucumber-api-tests





2\. Install dependencies:

mvn clean install





3\. Run tests:

mvn test





\## 🧪 API Test Scenarios



\### GET Request Testing

\- ✅ Status code validation (200)

\- ✅ Response structure verification

\- ✅ Headers validation

\- ✅ Path and IP confirmation



\### POST Request Testing

\- ✅ Complex JSON payload submission

\- ✅ Customer information validation

\- ✅ Payment details verification

\- ✅ Product information confirmation



\## 📊 Sample Test Output



✅ Base URI set to: https://echo.free.beeceptor.com

📤 GET Request: /sample-request?author=beeceptor

📊 Status Code: 200

✅ Status code validated: 200

✅ Field exists: path

✅ Field validated: path = /sample-request?author=beeceptor





\## 🔧 Test Configuration



Update `TestRunner.java` for:

@CucumberOptions(

features = "src/test/resources/features",

glue = "stepDefinitions",

plugin = {"pretty",

"html:target/cucumber-html-reports",

"json:target/cucumber-json-reports/cucumber.json"},

tags = "@GET or @POST"

)



\## 📊 Reports



View detailed test reports:

\- \*\*HTML Report:\*\* `target/cucumber-html-reports/index.html`

\- \*\*JSON Report:\*\* `target/cucumber-json-reports/cucumber.json`



\## 🔍 API Endpoints Tested



| Method | Endpoint | Purpose |

|--------|----------|---------|

| GET | `/sample-request` | Validate response structure and headers |

| POST | `/sample-request` | Test complex payload submission and parsing |



\## 🤝 Contributing



1\. Fork the repository

2\. Create feature branch

3\. Add new test scenarios

4\. Submit pull request



\## 📄 License



MIT License - see LICENSE file for details.



\## 👨‍💻 Author



\*\*\[Arun Chaubey]\*\* - Senior QA Automation Product Development Engineer 

📧 \[imakchaubey@gmail.com]  

🔗 \[https://www.linkedin.com/in/arunchaubey/]







