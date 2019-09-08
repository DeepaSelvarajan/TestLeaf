package org.testeaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods{

	public StartPage clickthuraipakkam()
	{
		driver.findElement(By.xpath("(//div[@class='items'])[1]")).click();
		return this;

	}

	public PickUpPage clickNext()
	{
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return new PickUpPage();

	}

}
