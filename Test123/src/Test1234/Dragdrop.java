package Test1234;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

  public class Dragdrop {

	    static WebDriver driver;			

	   		
	    public static void main(String[] args) throws IOException 
		{			
	    		
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");					
	         driver= new ChromeDriver();					
	         driver.get("https://jqueryui.com/droppable/");					
	         
			 //Element which needs to drag.    		
	         WebElement s =driver.findElement(By.id("draggable"));	
	         
	         WebElement d =driver.findElement(By.id("droppable"));					
	         		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);	
	         WebElement w =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
	         driver.switchTo().frame(w);

		     //Dragged and dropped.		
	         act.dragAndDrop(driver.findElement(By.id("id=\"draggable")),driver.findElement(By.id("droppable"))).build().perform();	
		}	
  }

	
