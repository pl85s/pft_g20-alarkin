package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
	
	@Test(dataProvider = "randomValidGroupsGeneration")
	public void testGroupCreationwithValidData(GroupData group) throws Exception {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupsPage();
		// save old state
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		// actions
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupCreation();
		app.getNavigationHelper().gotoGroupsPage();
		// save new state
		List<GroupData> newList = app.getGroupHelper().getGroups();
		// compare states		
		oldList.add(group);
		Collections.sort(oldList);
		assertEquals(newList, oldList);

		app.getNavigationHelper().gotoHomePage();
	}
}
