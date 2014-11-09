package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {

	@Test
	public void deleteSomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().selectContactByIndex(2);
		app.getContactHelper().submitDeleteContact();
		app.getNavigationHelper().gotoHomePage();
		
	}

}
