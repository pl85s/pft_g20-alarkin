package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test
	public void testNonEmptyContactCreation() throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().openNewContactPage();
		ContactData contact = new ContactData();
		contact.firstname = "First Name 1";
		contact.lastname = "Last Name 1";
		contact.address = "Address11\nAddress12";
		contact.hometel = "+7(495)777-77-77";
		contact.mobiletel = "+79175825969";
		contact.worktel = "+7(499)555-56-55 доб.112";
		contact.email1 = "E-mail1@mail.com";
		contact.email2 = "E-mail2@mail.com";
		contact.daybirthday = "16";
		contact.monthbirthday = "May";
		contact.yearbirthday = "1988";
		contact.group = "group name 1";
		contact.addresssecondary = "AddressSecondary11\nAddtessSecondary12";
		contact.homesecondarytel = "+74995525-69";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactCreation();
		app.getNavigationHelper().openHomePage();
	}

	@Test
	public void testEmptyContactCreation() throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().openNewContactPage();
		ContactData contact = new ContactData();
		contact.firstname = "";
		contact.lastname = "";
		contact.address = "";
		contact.hometel = "";
		contact.mobiletel = "";
		contact.worktel = "";
		contact.email1 = "";
		contact.email2 = "";
		contact.daybirthday = "-";
		contact.monthbirthday = "-";
		contact.yearbirthday = "";
		contact.group = "[none]";
		contact.addresssecondary = "";
		contact.homesecondarytel = "";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactCreation();
		app.getNavigationHelper().openHomePage();
	}
}
