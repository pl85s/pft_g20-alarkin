package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	public String firstname;
	public String lastname;
	public String address;
	public String hometel;
	public String mobiletel;
	public String worktel;
	public String email1;
	public String email2;
	public String daybirthday;
	public String monthbirthday;
	public String yearbirthday;
	public String group;
	public String addresssecondary;
	public String homesecondarytel;

	public ContactData() {
	}

	public ContactData(String firstname, String lastname, String address,
			String hometel, String mobiletel, String worktel, String email1,
			String email2, String daybirthday, String monthbirthday,
			String yearbirthday, String group, String addresssecondary,
			String homesecondarytel) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.hometel = hometel;
		this.mobiletel = mobiletel;
		this.worktel = worktel;
		this.email1 = email1;
		this.email2 = email2;
		this.daybirthday = daybirthday;
		this.monthbirthday = monthbirthday;
		this.yearbirthday = yearbirthday;
		this.group = group;
		this.addresssecondary = addresssecondary;
		this.homesecondarytel = homesecondarytel;
	}

	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result
			//	+ ((firstname == null) ? 0 : firstname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(ContactData other) {
		return this.firstname.toUpperCase().compareTo(other.firstname.toUpperCase());
	}	

}