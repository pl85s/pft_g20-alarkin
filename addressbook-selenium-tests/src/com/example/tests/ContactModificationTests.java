package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

	@Test
	public void modificationSomeContact() throws Exception {
		app.getNavigationHelper().openMainPage();
		// save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		app.getContactHelper().selectContactByIndex(2);
		ContactData Contact = new ContactData();
		Contact.firstname = "new first name 3";
		Contact.daybirthday = "17";
		Contact.monthbirthday = "May";
		Contact.homesecondarytel = "1";
		app.getContactHelper().fillContactFormWithoutGroup(Contact);
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().gotoHomePage();
		// save new state
		List<ContactData> newList = app.getContactHelper().getContacts();
		// compare states
		oldList.remove(0);
		oldList.add(0,Contact);
		Collections.sort(oldList);
		Collections.sort(newList);
		assertEquals(newList, oldList);
	}

}
