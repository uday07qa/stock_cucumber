@tag
Feature:
Login the admin page

@ApplicationLogin

Scenario:
As admin user i want to login the admin page

Given lanch browser
When lanchURL
And  wait for username with "xpath" and "//input[@id='username']" and "10"
And  Enter the username with "xpath" and "//input[@id='username']" and "admin"
And  wait for password  with "xpath" and "//input[@id='password']" and "10"
And Enter the password with "xpath" and "//input[@id='password']" and "master"
And  click on the login button with "xpath" and "//button[@id='btnsubmit']"
And  wait for logout link with "xpath" and "//li[@id='mi_logout']" and "10"
And  verify page title with "Dashboard « Stock Accounting"
And wait for logout button with "xpath" and "//li[@id='mi_logout']" amd "10"
And  click on the logout button with "xpath" and "//li[@id='mi_logout']"
And close the browser 


@multiple
Scenario Outline:
Given lanch browser
When lanchURL
And  wait for username with "xpath" and "//input[@id='username']" and "10"
And  Enter the username with "xpath" and "//input[@id='username']" and "<username>"
And  wait for password  with "xpath" and "//input[@id='password']" and "10"
And Enter the password with "xpath" and "//input[@id='password']" and "<password>"
And  click on the login button with "xpath" and "//button[@id='btnsubmit']"
And  wait for logout link with "xpath" and "//li[@id='mi_logout']" and "10"
And  verify page title with "Dashboard « Stock Accounting"
And wait for logout button with "xpath" and "//li[@id='mi_logout']" amd "10"
And  click on the logout button with "xpath" and "//li[@id='mi_logout']"
And close the browser 
Examples:
|username|password|
|uday12|12345|
|sdfsdf|3234234|
|admin|master|
