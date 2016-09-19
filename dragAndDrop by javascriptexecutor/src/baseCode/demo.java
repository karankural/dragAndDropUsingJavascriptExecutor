package baseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	
	
	public static void main(String[] args) {
		// creating instance of web driver.
		WebDriver driver = new FirefoxDriver();
		
		// enter url on which you want work.
		driver.get("--------- URL ----------");
		
		// first find dragFrom and dragTo element.
		// you can findelement by id, CSSselector or xpath.
		WebElement selectorDragFrom, selectorDragTo;
		
		// drag from element.
		selectorDragFrom = driver.findElement(By.id("Enter element id"));
		
		// drag to element.
		selectorDragTo = driver.findElement(By.id("Enter element id"));
		
		//
		
		//((JavascriptExecutor)driver).executeScript(arg0, arg1) = 
		
				
		

	}

}
