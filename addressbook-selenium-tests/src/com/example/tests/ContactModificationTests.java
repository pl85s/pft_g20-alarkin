package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void modificationSomeContact () throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().selectContactByIndex(2);
		ContactData Contact = new ContactData ();
		Contact.firstname = "new first name";
		Contact.daybirthday="17";
		Contact.monthbirthday="May";
		Contact.homesecondarytel="1";
	    app.getContactHelper().fillContactFormWithoutGroup(Contact);
	    app.getContactHelper().submitContactModification();
	    app.getNavigationHelper().gotoHomePage();
	}

}
