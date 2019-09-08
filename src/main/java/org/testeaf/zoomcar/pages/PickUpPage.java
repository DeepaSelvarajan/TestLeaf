package org.testeaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;
public class PickUpPage extends ProjectSpecificMethods {
	
	public PickUpPage clickTomorrow()
	{
		driver.findElement(By.xpath("//div[contains(@class,'day picked')]")).click();
		return this;
	}
	
	public DropOffPage clickNext()
	{
		driver.findElement(By.className("proceed")).click();
		return new DropOffPage();
	}

}
