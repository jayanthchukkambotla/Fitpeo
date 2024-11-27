




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;


public class Fitpeo {

	public static void main(String[] args) throws Exception {		
		
		WebDriver driver = new ChromeDriver(); // launches Chrome
		
		driver.manage().window().maximize(); // maximizes the browser
		
		Thread.sleep(2000); // wait for 2 seconds 
		
		driver.get("https://www.fitpeo.com/"); // opens the website
		
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click(); // opens revenue calculator
		
		Thread.sleep(2000); // wait for 2 seconds 
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Patients should be between 0 to 2000']")); // stores the web element 
		
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform(); // scrolls down the page 
		
		 
		WebElement slider = driver.findElement(By.cssSelector("input[data-index='0']"));// stores the web element 
    	
	//	WebElement slider= driver.findElement(By.cssSelector("input[aria-valuenow='200']"));
		Actions act1 = new Actions(driver);
		 
		 Thread.sleep(2000); // wait for 2 seconds 
		 
		 // JavascriptExecutor js = (JavascriptExecutor) driver;
		  //js.executeScript("arguments[0].setAttribute('aria-valuenow', '820');", slider);// will update  slider position to 820 but text box value is not getting updated so this is not used 

		 
		 act1.clickAndHold(slider).moveByOffset(94, 0).release().perform(); // moves the slider position to 820
		 
		 Thread.sleep(2000); // wait for 2 seconds 
		 
		 
		 WebElement ele1 = driver.findElement(By.xpath("//p[text()='CPT-99453']"));// stores the web element 
		 act.scrollToElement(ele1).perform(); // scrolls down the page
		 
		 
		  WebElement textbox = driver.findElement(By.cssSelector("input[aria-invalid='false']")); // stores the web element 
		  
		 textbox.click(); // clicks on text box 
		 
		 textbox.sendKeys(Keys.BACK_SPACE);    // will remove a character in text box 
		 textbox.sendKeys(Keys.BACK_SPACE);    // will remove a character in text box 
		 textbox.sendKeys(Keys.BACK_SPACE);    // will remove a character in text box 
		  
		 Thread.sleep(2000);        // wait for 2 seconds 
		 textbox.sendKeys("560");   // enters 560 value in text box 
		 	 
		 Thread.sleep(2000);        // wait for 2 seconds 
		 
		 
		 String  sliderValue = slider.getAttribute("value");       // captures slider value 
         System.out.println("slider value is at: " +sliderValue);   // prints current slider value 

		 
		 Thread.sleep(2000); // wait for 2 seconds 
		 textbox.sendKeys(Keys.BACK_SPACE);
		 textbox.sendKeys(Keys.BACK_SPACE);
		 textbox.sendKeys(Keys.BACK_SPACE);
		 
		 textbox.sendKeys("820"); // enters 820 value again in textbox to get final Reimbursement value to 110700
		 
		 Thread.sleep(2000); // wait for 2 seconds 
		 
		 
		 
	      WebElement cpt =	 driver.findElement(By.xpath("//p[text()='CPT-99454']")); // stores the web element 
	      act.scrollToElement(cpt).perform(); // scrolls down the page
	      
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click(); // select the check box
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click(); // select the check box
	      
	      Thread.sleep(2000); // wait for 2 seconds 
	      
	      
	      WebElement cpt1 = driver.findElement(By.xpath("//p[text()='CPT-99458']")); // stores the web element 
	      act.scrollToElement(cpt1).perform(); // scrolls down the page
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click(); // select the check box
	      
	      Thread.sleep(2000); // wait for 2 seconds 
	      
	      
	      WebElement cpt2 = driver.findElement(By.xpath("//p[text()='CPT-99439']")); // stores the web element 
	      act.scrollToElement(cpt2).perform(); // scrolls down the page
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click(); // select the check box
	      
	    WebElement TotalRecurringReimbursement = driver.findElement(By.xpath("(//p[text()='110700'])[1]"));
	    if(TotalRecurringReimbursement.isDisplayed()) {   // will validate value displayed in header
	    	
	    	System.out.println("Total Recurring Reimbursement for all Patients Per Month:$110700"); // prints out the statement
	    }
	      
	    Thread.sleep(2000); // wait for 2 seconds 
	    
	    driver.quit(); // will close the browser completely
	
	      
		 
		 
		 
		 
		 
	}
}
