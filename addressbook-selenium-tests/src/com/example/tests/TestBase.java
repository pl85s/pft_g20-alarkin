package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.Spring;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {

	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	}

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	}

	@DataProvider
	public Iterator<Object[]> randomValidGroupsGeneration () {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++ ){
			GroupData group = new GroupData();
			group.name = generaateRandomString(); 
			group.header= generaateRandomString(); 
			group.footer= generaateRandomString(); 
			list.add(new Object [] {group});
		}
		return list.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> randomValidContactsGeneration () {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++ ){
			ContactData contact = new ContactData();
			contact.firstname = generaateRandomString();
			contact.lastname = generaateRandomString(); 
			contact.address = generaateRandomString(); 
			contact.hometel = generaateRandomString(); 
			contact.mobiletel = generaateRandomString(); 
			contact.worktel = generaateRandomString(); 
			contact.email1 = generaateRandomString(); 
			contact.email2 = generaateRandomString(); 
		    contact.daybirthday = generateRandomElementFromList(1); 
			contact.monthbirthday = generateRandomElementFromList(2); 
			contact.yearbirthday = generaateRandomString(); 
		    contact.group = generateRandomElementFromList(3); 
			contact.addresssecondary = generaateRandomString(); 
			contact.homesecondarytel = generaateRandomString(); 
			list.add(new Object [] {contact});
		}
		return list.iterator();
	}
	
	public String generaateRandomString () {
		Random rnd = new Random ();
			if (rnd.nextInt(3)== 0){
			return "";
			}else{
				return "test" + rnd.nextInt() ;
			}
	}
	

		protected String generateRandomElementFromList(int element) {
			List<String> webElementsNames = app.getContactHelper().getWebElementsTextList(element);
			Random rnd = new Random();
			return webElementsNames.get(rnd.nextInt(webElementsNames.size()));
}


}