package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public HelperBase groupHelper;

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

	public void gotoHomePage() {
		click(By.linkText("home"));
	}

	public void openHomePage() {
		click(By.linkText("home"));
	}

	public void gotoGroupsPage() {
		click(By.linkText("groups"));
	}

	public void openNewContactPage() {
		click(By.linkText("add new"));
	}
}
