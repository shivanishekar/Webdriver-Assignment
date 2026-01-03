1. Difference between driver.get() and driver.navigate() 
-> driver.get()`             
. Used to open a URL 
. Accepts only URL
. Simple and direct   
. Syntax: driver.get("URL")

-> driver.navigate()                               
. Used for browser navigation                         
. Has multiple methods
. More control                                        
. Methods: `to()`, `back()`, `forward()`, `refresh()` 

EXAMPLE :

driver.get("https://www.google.com");

driver.navigate().to("https://www.google.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

