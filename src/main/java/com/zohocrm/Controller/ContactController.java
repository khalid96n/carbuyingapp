package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.ContactService;
import com.zohocrm.entities.Contact;

@Controller
public class ContactController {

	
	@Autowired
	private ContactService contactServ;
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactServ.listContact();
		model.addAttribute("contacts", contacts);
		return "search_Contact_Result";
 	}
	
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactServ.getOneConatctById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	
}
