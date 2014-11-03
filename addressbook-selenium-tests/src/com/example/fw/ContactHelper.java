package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ContactData;


public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactCreation() {
	    click(By.name("submit"));
	}

	public void fillContactForm(ContactData contact) {
	   type(By.name("firstname"), contact.firstname);
	   type(By.name("lastname"), contact.lastname);
	   type(By.name("address"), contact.address);
	   type(By.name("home"), contact.hometel);
	   type(By.name("mobile"), contact.mobiletel);
	   type(By.name("work"), contact.worktel);
	   type(By.name("email"), contact.email1);
	   type(By.name("email2"), contact.email2);
	   selectByText(By.name("bday"), contact.daybirthday);
	   selectByText(By.name("bmonth"), contact.monthbirthday);
	   type(By.name("byear"), contact.yearbirthday);
	   //selectByText(By.name("new_group"), contact.group);
	   type(By.name("address2"), contact.addresssecondary);
	   type(By.name("phone2"), contact.homesecondarytel);
	}

}
