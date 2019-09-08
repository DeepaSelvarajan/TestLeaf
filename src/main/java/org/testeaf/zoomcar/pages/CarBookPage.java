package org.testeaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods {
	 
	public CarBookPage clickDecSort() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()=' Price: High to Low ']")).click();
		Thread.sleep(3000);
		return this;
		
	}
	
public CarBookPage getFirstCarName()
{
	String CarName = driver.findElement(By.xpath("//h3[text()='Mahindra Scorpio']")).getText();
	System.out.println("Car Name is:" +CarName);
	return this;
}
}
