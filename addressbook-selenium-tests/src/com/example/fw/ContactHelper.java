package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;
import com.example.tests.GroupData;

public class ContactHelper extends HelperBase {
	
	private String bDayXpath = "//form[@action=\"edit.php\"]/select[@name=\"bday\"]/option";
	private String bMonthXpath = "//form[@action=\"edit.php\"]/select[@name=\"bmonth\"]/option";
	private String groupXpath = "//form[@action=\"edit.php\"]/select[@name=\"new_group\"]/option";

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
		selectByText(By.name("new_group"), contact.group);
		type(By.name("address2"), contact.addresssecondary);
		type(By.name("phone2"), contact.homesecondarytel);
	}

	public void fillContactFormWithoutGroup(ContactData contact) {
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
		type(By.name("address2"), contact.addresssecondary);
		type(By.name("phone2"), contact.homesecondarytel);
	}

	public void selectContactByIndex(int index) {
		click(By.xpath("//tr[" + index + "]//td[1]"));
		click(By.xpath("//tr[" + index + "]//td[7]"));
	}

	public void submitDeleteContact() {
		click(By.xpath("//input[@value='Delete']"));
	}

	public void submitContactModification() {
		click(By.xpath("//input[@value='Update']"));

	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> fields = driver.findElements(By.xpath("//table//tr [@class='odd' or @class='even'  ]//td[3]"));
		for (WebElement field : fields) {
		ContactData contact =  new ContactData();
		String td = field.getText();
		contact.firstname=td;	
		contacts.add(contact);
		}
		return contacts;
	}

		public List<String> getWebElementsTextList(int element) {
			String xpath = "";
			if (element==1) {
				xpath = bDayXpath;
			}{if (element==2){
				xpath = bMonthXpath;}{
				xpath = groupXpath;}
			}
			List<String> rArray = new ArrayList<String>();
			List<WebElement> webElems = driver.findElements(By.xpath(xpath));
			for (WebElement webElem : webElems) {
				String webElemText = webElem.getText();
				rArray.add(webElemText);
			}
			return rArray;
		}
	
}
