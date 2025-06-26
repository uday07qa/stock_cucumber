@tag
Feature:
Adding the stockitems
@Single_stockitem
Scenario:
Given lanch browser
When lanchURL
And  wait for username with "xpath" and "//input[@id='username']" and "10"
And  Enter the username with "xpath" and "//input[@id='username']" and "admin"
And  wait for password  with "xpath" and "//input[@id='password']" and "10"
And Enter the password with "xpath" and "//input[@id='password']" and "master"
And  click on the login button with "xpath" and "//button[@id='btnsubmit']"
And  wait for logout link with "xpath" and "//li[@id='mi_logout']" and "10"
And  verify page title with "Dashboard « Stock Accounting"
And  wait for the stockitem with "xpath" and "//*[text()='Stock Items ']" and "10"
And  click onthestockitem with "xpath" and "//*[text()='Stock Items ']"
And  click on addbutton with "xpath" and "(//a[@data-caption='Add'])[1]" 
And   wait for category with "id" and "x_Category" and "10"
And  select the category with "xpath" and "//select[@id='x_Category']" and "1"
And  wait for suppliernumber with "xpath" and "//select[@id='x_Supplier_Number']" and "10"
And  select suppliernumber with "xpath" and "//select[@id='x_Supplier_Number']" and "2"
And  wait forstocknumber with "xpath" and "//input[@id='x_Stock_Number']" and "3000"
And  capture stocknumber with "xpath" and "//input[@id='x_Stock_Number']"
And  enter the stock name with "xpath" and "//input[@id='x_Stock_Name']" and "testbgg"
And  select theUnit Of Measurement with "xpath" and "(//select[@data-table='a_stock_items'])[3]" and "2"
And  enter the Purchasing Price with "xpath" and "//input[@id='x_Purchasing_Price']" and "3000"
And   enter the sellerprice with "xpath" and "//input[@id='x_Selling_Price']" and "2000"
And   enter the note with "xpath" and "//input[@id='x_Notes']" and "testing note"
And   click on the addbutton with  "xpath" and "//button[@id='btnAction']" 
And   waitforconfirm ok button with "3000"
And    click on confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
And   waitforconfirm Alertok button with "3000"
And   click on Alertok button with "xpath" and "(//button[text()='OK'])[6]"
And   verify stocktable 
And   close the browser 



