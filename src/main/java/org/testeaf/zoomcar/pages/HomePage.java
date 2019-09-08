package org.testeaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	 public StartPage clickStart()
	 {
		 driver.findElementByClassName("search").click();
		 return new StartPage();
	 }

}
