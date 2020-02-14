package SeleniumBasics_Java.SeleniumBasics_Java;

public class XpathsSyntaxesInSelenium {

	/*
	 * 1. Using Single Slash:
	 * html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]
	 * 
	 * 2. Double Slash: //form/div[1]/div/div[1]/div/div/input[1]
	 * 
	 * 3. Single Attribute: //input[@id='Email'] or //*[@id='Email']
	 * 
	 * 4. Multiple Attribute: //input[@id='Email'][@name='Email'] or
	 * //*[@id='Email'][@name='Email']
	 * 
	 * 5.Using AND: //input[@id='Email' and @name='Email'] or
	 * 
	 * //*[@id='Email' and @name='Email']
	 * 
	 * 6. Using OR: //input[@id='Email' or @name='Email']
	 * 
	 * or
	 * 
	 * //*[@id='Email' or @name='Email']
	 * 
	 * 7. contains(): //input[contains(@id,'Email')]
	 * 
	 * or
	 * 
	 * //*[contains(@id,'Email')]
	 * 
	 * or
	 * 
	 * //input[contains(@name,'Email')]
	 * 
	 * or
	 * 
	 * //*input[contains(@name,'Email')]
	 * 
	 * 8. starts-with(): //input[starts-with(@id,'Ema')]
	 * 
	 * or
	 * 
	 * //*[starts-with(@id,'Ema')]
	 * 
	 * 
	 * 9. text(): //*[text()='New look for sign-in coming soon']
	 * 
	 * 10. last() and [last()-1]
	 * findElement(By.xpath("(//input[@type='text'])[last()]"))
	 * findElement(By.xpath("(//input[@type='text'])[last()-1]"))
	 * 
	 * 11. position():
	 * findElement(By.xpath("(//input[@type='text'])[position()=2]"))
	 * 
	 * or
	 * 
	 * findElement(By.xpath("(//input[@type='text'])[2]"))
	 * 
	 * 
	 * 13. following: By using this we could select everything on the web page after
	 * the closing tag of the current node
	 * 
	 * xpath of the FirstName field is as follows //*[@id='FirstName'] To identify
	 * the input field of type text after the FirstName field, we need to use the
	 * below xpath.
	 * 
	 * 
	 * //*[@id='FirstName']/following::input[@type='text'] Here I used, following
	 * xpath axes and two colons and then specified the required tag (i.e., input)
	 * 
	 * To identify just the input field after the FirstName field, we need to use
	 * the below xpath.
	 * 
	 * 
	 * //*[@id='FirstName']/following::input
	 * 
	 * 14. preceding: Selects all nodes that appear before the current node in the
	 * document, except ancestors, attribute nodes and namespace nodes
	 * 
	 * xpath of the LastName field is as follows
	 * 
	 * 
	 * //*[@id='LastName'] To identify the input field of type text before the
	 * LastName field, we need to use the below xpath.
	 * 
	 * //*[@id='LastName']//preceding::input[@type='text']" Here I used, preceding
	 * xpath axes and two colons and then specified the required tag
	 * 
	 */

}
