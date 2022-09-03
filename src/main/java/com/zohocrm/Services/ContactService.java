package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);
	public List<Contact> listContact();
	public Contact getOneConatctById(long id);
	
}
