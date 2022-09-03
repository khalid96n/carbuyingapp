package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.ContactService;
import com.zohocrm.Services.LeadService;
import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadserv;
	
	@Autowired
	private ContactService contactserv;
	
	@RequestMapping("/")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadserv.saveOneLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id) {
		Lead lead = leadserv.getOnLeadById(id);
		
		Contact contact =new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactserv.saveContact(contact);
		
		leadserv.deleteOneLeadById(id);
		
		return " ";
	}
	
	@RequestMapping("/listAll")
	public String listAllLeads(ModelMap model) {
		List<Lead> lead = leadserv.listLeads();
		model.addAttribute("lead", lead);
		return "search_Lead_Result";
 	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadserv.getOnLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
}
