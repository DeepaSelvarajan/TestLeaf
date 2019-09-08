package org.testeaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class DropOffPage extends ProjectSpecificMethods {
	
	public CarBookPage clickDone()
	
	{
		driver.findElement(By.className("proceed")).click();
		return new CarBookPage();
		
	}

}
