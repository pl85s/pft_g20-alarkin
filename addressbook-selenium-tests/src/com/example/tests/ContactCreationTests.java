package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test(dataProvider = "randomValidContactsGeneration")
	public void testNonEmptyContactCreation(ContactData contact) throws Exception {
		app.getNavigationHelper().openMainPage();
		// save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		app.getNavigationHelper().openNewContactPage();
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactCreation();
		app.getNavigationHelper().openHomePage();
		// save new state
		List<ContactData> newList = app.getContactHelper().getContacts();
		// compare states		
		oldList.add(contact);
		Collections.sort(newList);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

}
