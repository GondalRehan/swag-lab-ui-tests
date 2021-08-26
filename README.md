# SWAG Labs Automation Framework


This is a Selenium Hybrid Framework.
 - Written in **JAVA**
 - Implemented using **TestNG**
 - Build Toold - Maven
 - Implemented Page Object Model Design Pattern
 - Ashot - To Capture Full Page Screenshot

### Browsers Supported
 - Mozilla Firefox
 - Google Chrome


### Headerless Support
 - HTMLUnit
 - Chrome Headless

### Platform Support
 - Windows
 - Linux
 - Macintosh

---
### Reporting
 - [Extent Reporting](http://extentreports.com/)

---
### Usage
```sh
$ mvn clean test
```
---
### Browser Setup
 - Navigate to *WebAutomation\src\main\resources* change *BrowserType* in the application.properties
 or use Maven to invoke different browsers

```sh
$ mvn clean test -DBrowserType=Chrome			#Chrome
$ mvn clean test -DBrowserType=Chrome_Headless		#Chrome Headless
$ mvn clean test -DBrowserType=Firefox			#Mozilla Firefox
```
---
### Report Details

**Report Location** `System.getProperty("user.dir") + "/src/test/resources/Reports/";`

**Failed Screenshots** `System.getProperty("user.dir") + "/src/test/resources/Reports/Images";`

---


### @DataProviders

 - Used array for test data but change it in future with **.xlsx** file


