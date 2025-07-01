@tag
Feature:

@exestinguser

Scenario:
Given open the lanchbrowser
When open the projectwebsite
And click on the signup with "xpath" and "//header//a[contains(text(),'Sign In')]"
And scroll down for username field with "400"
And enter the username with "id" and "email" 
And enter the password with "id" and "pass" 
And click on signup button with "xpath" and "(//span[contains(text(),'Sign In')])[1]"
Then verify the user name  need to display the user menu  with "xpath" and "(//li[@class='greet welcome'])[1]//span" and "varas"
And wait for some seconds with "4000"
And close the browser