# Web Automation with OrangeHRM Website by using Selenium TestNG



## Tool used for this Project
 - Selenium
 - intellij
 


## Framework used for this Project
 - TestNG


 ## Project Scenarios
 
2. Create 2 new employees and save it to a JSON list
3. Now go to PIM dashboard and search by 1st user name. Assert that the user is found.
4. Now click on the user from the search table and update id by random userid
5. Now again search the user by new user id from the PIM dashboard menu and assert that the user is found
6. Now logout from admin and login with the 2nd user from your JSON list
7. Now click on My Info menu
8. Select Gender and Blood Type and save it
9. Click on contact details and input address and email
10. Logout the user

 ## How to run this project:
 - Clone this project
 -  command:
  ```
 gradle clean test
 ```
 
  ## To Generate Allure Report: 
 - Give the following commands in terminal :
```
allure generate allure-results --clean -o allure-report
 ```
 ```
 allure serve allure-results
 
 
```


 
## Selenium TestNG Automation Report Image

![334465100_741884750781011_6086405343220731916_n](https://user-images.githubusercontent.com/123531000/222142900-4e522476-0e8c-4de5-b879-f1615ef5bb92.png)





![334196471_569819025094889_6927263293160986075_n](https://user-images.githubusercontent.com/123531000/222142878-19ed4abf-c4f4-4084-bfeb-e2dce0b2ec00.png)

