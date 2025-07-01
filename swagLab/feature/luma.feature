@tag
Background:
Given open the lanchbrowser
When open the projectwebsite
Feature:
login the application

@loginflow
Scenario:
Given open the lanchbrowser
When open the projectwebsite
And Wait for create account "xpath" and "(//a[.='Create an Account'])[1]" and "10"
And Click on create account with "xpath" and "(//a[.='Create an Account'])[1]" 
And Wait for create form "name" and "firstname" and "10"
And Enter the firestname with "name" and "firstname" and "varas"
And Enter the lastname with "name" and "lastname" and "K"
And Enter the Email with "name" and "email" and "testsada123@gmail.com"
And Enter the password with "xpath" and "//input[@id='password']" and "!@#$%54321qwer"
And Enter the re-enterpassword with "xpath" and "//input[@id='password-confirmation']" and "!@#$%54321qwer"
And click on the createaccount button with "xpath" and "(//span[contains(text(),'Create an Account')])[1]"
Then verify the username is  valid  "xpath" and "(//span[@class='logged-in'])[1]" and "varas"