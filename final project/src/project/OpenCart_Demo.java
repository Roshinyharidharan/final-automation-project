package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class OpenCart_Demo 
{
	WebDriver driver;
	Select s;
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vishnu\\OneDrive\\roshiny files\\AUTOMATION TESTING\\Browser Extensions\\chromedriver.exe");
	   
	    driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//get url
		driver.get("https://demo.opencart.com/");
  }
  @Test(priority=1)
  public void login() throws Exception
  {
	 // Click on My Account
	  
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  // Click on the Login Button
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  // Enter Email id
	  
	  driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ashwni.winz@gmail.com");
	  Thread.sleep(2000);
	  
	  // Enter Password
	  
	  driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("7847324345");
	  Thread.sleep(2000);
	  
	  // Click on the login Button
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	  
  }
  
  
  
  
  
  @Test(priority=2) 
  public void mouseHover() throws Exception
  {
	//Create object of Actions class
	  Actions a=new Actions(driver); 
	  
	//Create object of list with element
		List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li")); 
				
		//Store list size
		int size=ls.size();
		System.out.println("No of modules:" +size);
		
		for(int i=1;i<=size;i++)
		{
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li["+i+"]")).getText());
			Thread.sleep(1000);
			
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li["+i+"]"))).click().perform();
		}
	  
	  
  }
  
  @Test(priority=3)
  public void desktop() throws Exception
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[1]/a")).click(); //PC
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click(); //Continue
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click(); //Mac
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));//Show drop down
	  s.selectByIndex(2); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("2");; //Mac
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click(); //Add to Cart
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click(); //Click Desktops
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click(); //Show all Desktops
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]"))); //from A - Z
	  s.selectByIndex(1);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click(); //Click Apple Cinema 30
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[1]/label/input")).click(); //CheckBoxButton
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option208\"]")).sendKeys("I like this product"); //Show all Desktops
	  Thread.sleep(1000);
	  s= new Select(driver.findElement(By.xpath("//*[@id=\"input-option217\"]"))); //select colour
	  s.selectByIndex(1);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"input-option209\"]")).sendKeys("Nice product but cost is high so need within 70 dollors and nothing to tell much about this product."); //Text
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"product\"]/div[7]/div/span/button/i")).click(); //Date
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/table/tbody/tr[4]/td[4]")).click(); //Date 24
	  Thread.sleep(1000);
	  
//	  driver.findElement(By.xpath("//*[@id=\"product\"]/div[8]/div/span/button/i")).click(); //Time1
//	  Thread.sleep(1000);
//	  
//	  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/table/tbody/tr[2]/td[3]")).click(); //ClickTime1
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/table/tbody/tr[2]/td[3]/span")).click(); //Select Time1
//	  Thread.sleep(1000);
//	  
//	  driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/table/tbody/tr[2]/td[2]")).click(); //ClickTime2
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/table/tbody/tr[2]/td[3]")).click(); //Select Time2
//	  Thread.sleep(1000);
	  
//	  driver.findElement(By.xpath("//*[@id=\"input-option221\"]")).sendKeys("06:25");
//	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"product\"]/div[9]/div/span/button")).click(); //Date
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[4]/td[5]")).click(); //PickDate
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("2"); //Quantity
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click(); //Click Add to Cart
	  Thread.sleep(1000);
  }
  
  @Test(priority=4)
  public void laptopsAndNotebooks() throws Exception
  {
	  // Click on Laptops & Notebooks :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  // Click on Macs :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  // Click on Continue :
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	  Thread.sleep(1000);
	// Click on Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
	  // Click On Windows :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	// Click on Continue :
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		  Thread.sleep(1000);
		  // Click on Laptops & Notebooks :
		  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		  Thread.sleep(2000);
	
	  // Click on Show All Laptops & Notebooks :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")).click();
	  Thread.sleep(2000);
	  
	
	  //Select Sort By
	  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
	   s.selectByIndex(4);
	   //Select Show Item
	   s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
	   s.selectByIndex(4);
		  Thread.sleep(1000);
  }
  
  @Test(priority=5)
  public void components() throws Exception
  {
	  // Click On Componenets :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
	  Thread.sleep(2000);
	  // Click On Show All Components  :
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")).click();
	  Thread.sleep(2000);
	  // click On Monitors :
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	
	  //Select Sort By
	  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
	   s.selectByIndex(4);
	   //Select Show Item
	   s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
	   s.selectByIndex(4);
		  Thread.sleep(1000);
		  
		  //Click On Item
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img")).click();
		  //Click on Quantity
		  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
		  //Click On Add to cart
		  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		  Thread.sleep(1000);
  }
  
  @Test(priority=6)
  public void tablets() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
	  

	    s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
	   s.selectByIndex(6);
	   
	   s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
	   s.selectByIndex(4);
	   
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	   driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
	   driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	   Thread.sleep(2000);
  }
  
  @Test(priority=7)
  public void software() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[5]/a")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
  }
  
  @Test(priority=8)
  public void phonesAndPDAS() throws Exception
  {
	  
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
	  Thread.sleep(2000);
	  
	  
	  // Select by Sort by 
	  s=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		s.selectByIndex(3);
		Thread.sleep(2000);
	  
	// Select show how many items to be displayed
		
		s=new Select(driver.findElement(By.xpath("//*[@id=\"input-limit\"]")));
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		// Select a phone Item
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		
		// Slecet quantity 
		
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
		Thread.sleep(2000);
		
		// Click on Add to cart
		
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	  
  }
  
  @Test(priority=9)
  public void cameras() throws Exception
  {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a")).click();
	  Thread.sleep(2000);
	  //default
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div/select")));
	  s.selectByVisibleText("Name (Z - A)");
	  Thread.sleep(1000);
	  //show
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/select")));
	  s.selectByVisibleText("25");
	  Thread.sleep(1000);
	  //nikon
	  driver.findElement(By.linkText("Nikon D300")).click();
	  Thread.sleep(2000);
	  //review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[2]/li[2]/a")).click();
	  Thread.sleep(2000);
	  //name in review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[2]/div/input")).sendKeys("lilly");
	  Thread.sleep(2000);
	  //review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[3]/div/textarea")).sendKeys("It's the latest model in Canon's entry-level Rebel lineup, and it has a fully articulated touchscreen and a 24.1-megapixel sensor. Canon's menu system is incredibly intuitive and easy to navigate, and the camera is compatible with any of Canon's EOS 5dlenses, so you have plenty to choose from as you grow.");
	  Thread.sleep(2000);
	  //review rating
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[4]/div/input[4]")).click();
	  Thread.sleep(2000);
	  //continue
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[5]/div/button")).click();
	  Thread.sleep(2000);
	  
	  //qty
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/input[1]")).sendKeys("2");
	  Thread.sleep(1000);
	  //Add to cart
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=10)
  public void mp3Players() throws Exception
  {
	  
	  // click on the mp3
	  driver.findElement(By.linkText("MP3 Players")).click();
	  driver.findElement(By.linkText("Show All MP3 Players")).click();
	  Thread.sleep(2000);
	  //Sort by
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[3]/div/select")));
	  s.selectByVisibleText("Name (Z - A)");
	  Thread.sleep(1000);
	  //show
	  s=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[4]/div/select")));
	  s.selectByVisibleText("15");
	  Thread.sleep(1000);
	  //ipod classic
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
	  Thread.sleep(2000);
	//review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[2]/li[2]/a")).click();
	  Thread.sleep(1000);
	  //name in review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[2]/div/input")).sendKeys("lilly");
	  Thread.sleep(1000);
	  //review
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[3]/div/textarea")).sendKeys("It's the latest model in Canon's entry-level Rebel lineup, and it has a fully articulated touchscreen and a 24.1-megapixel sensor. Canon's menu system is incredibly intuitive and easy to navigate, and the camera is compatible with any of Canon's EOS 5dlenses, so you have plenty to choose from as you grow.");
	  Thread.sleep(1000);
	  //review rating
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[4]/div/input[4]")).click();
	  Thread.sleep(1000);
	  //continue
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[5]/div/button")).click();
	  Thread.sleep(1000);
	  
	  //qty
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/input[1]")).sendKeys("1");
	  Thread.sleep(1000);
	  //Add to cart
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/button")).click();
	  Thread.sleep(2000);
  }
  
  
  
  @Test(priority=11)
  public void search() throws Exception
  {
	  // Enter  the item name to search 
	  
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Iphone");
	  Thread.sleep(2000);
	  
	  // click on the search button
	  
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	  
	  // click on thr product
	   
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).click();
	  Thread.sleep(2000);
	  
	  // Enter the quantity 
	  
	  driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("1");
	  Thread.sleep(2000);
	  
	  // Click on the add to cart button
	  
	  driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	  Thread.sleep(2000);
	  
	  
  }
  
  @Test(priority=12)
  public void carts() throws Exception
  {
	  // click on the cart button
	  
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	  Thread.sleep(2000);
	  
	  // Click on the view cart
	  
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
	  Thread.sleep(2000);
	  
	  //Enter the update  quantity 
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");
	  Thread.sleep(2000);
	  
	  // click on the Update button
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")).click();
	  Thread.sleep(2000);
	  
	  //Click on the checkout 
	  
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
	  Thread.sleep(2000);
	  
	  //
	  
	  
	  
	  
  }
  


  @AfterTest
  public void afterTest() 
  {
	  
	  driver.close();
	  
	  
  }

}