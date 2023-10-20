# DMoney-API-RestAssured-Automation
  I have created a Rest Assured Automation project for Dmoney API and assertrd successfull activities.

## Scenario
   Do following steps using the API's from this collection:
https://api.postman.com/collections/1844288-143eb923-423f-4c91-a198-fe6e56d20e35?access_key=PMAT-01GJ3CC22Q0066PJWP3T0XHQ8G

1. Do Login by admin
2. Create 2 new customers and a agent
3. Give 2000 tk from System account to the newly created agent
4. Deposit 1500 tk to a customer from the agent account
5. Withdraw 500 tk by the customer to the agent
6. Send money 500 tk to another customer
7. Payment 100 tk to a merchant (01686606905) by the recipient customer
8. Check balance of the recipient customer

Hints:
1. Keep the baseUrl, partnerKey and token into config.properties file
2. Keep the new customers and agents necessary  info to a json array file for chaining API's (if needed to transact amount between 2 users)
3. No need to create test cases or negative cases. Just automate the above activities.

## Used Tools
   - Intellij
   - Jdk-11
   - Allure

## Used Frameworks
   - Rest Assured
   - TestNG

## Images of Allure Report
   ![Screenshot_29](https://github.com/RedoySQA/DMoney-API-RestAssured-Automation/assets/143482478/0cf72051-837e-4465-a005-ff8803f0c2ea)
   ![Screenshot_30](https://github.com/RedoySQA/DMoney-API-RestAssured-Automation/assets/143482478/b2e538de-fdc0-44ea-8ce0-012af156eeb3)

## Automation Output Video
   https://github.com/RedoySQA/DMoney-API-RestAssured-Automation/assets/143482478/f0dba21d-0add-4445-aef3-6b625f6d0052
   
## How To Run This project
   - Clone this project
   - Open this project in intellij
   - Hit this command in terminal
     gradle clean test
   - To generate allure report hit these command in terminal
     allure generate allure-results --clean -output
     allure serve allure-results


