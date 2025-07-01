@tag
Feature:
Adding product to card

Background:
Given open the lanchbrowser
When open the projectwebsite
And click on the signup with "xpath" and "//header//a[contains(text(),'Sign In')]"
And scroll down for username field with "400"
And enter the username with "id" and "email" 
And enter the password with "id" and "pass" 
And click on signup button with "xpath" and "(//span[contains(text(),'Sign In')])[1]"

Scenario:
And wait for mens with "3000"
When click on the mens with "xpath" and "//span[normalize-space()='Men']"
When wait for the add with "xpath" and "//div[@id='dismiss-button']" and "20"
And close the adds with "xpath" and "//div[@id='dismiss-button']"
And wait for bottoms with "3000"
And move mouse to bottoms with "xpath" and "(//span[text()='Bottoms'])[2]"
And wait for short with "3000"
And move to shorts and click on it with "xpath" and "(//span[contains(text(),'Shorts')])[2]"
And wait for short with "3000"
And scroll the the first product with "300"
And click on the wishlist   with "xpath" and "(//a[@title='Add to Wish List'])[1]"
And scroll to add to card with "300"
And click on add to card button  with "xpath" and "(//span[contains(text(),'Add to Cart')])[4]"
And wait for size with "2000"
And click the size with "xpath" and "//*[@id='option-label-size-143-item-176']"
And click the colour with "xpath" and "(//*[@index='2'])[2]"
And enter the quantity with "xpath" and "//input[@id='qty']" and "3"
And click on add_to_cart with "xpath" and "//*[@title='Add to Cart']"


