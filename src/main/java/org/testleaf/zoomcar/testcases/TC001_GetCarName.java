package org.testleaf.zoomcar.testcases;

import org.testeaf.zoomcar.pages.HomePage;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class TC001_GetCarName extends ProjectSpecificMethods {
	@Test
	public void runTC001() throws InterruptedException
	{
		new HomePage()
		.clickStart()
		.clickthuraipakkam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone();
	}

}
