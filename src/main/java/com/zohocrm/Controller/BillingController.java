package com.zohocrm.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.BillingService;
import com.zohocrm.Services.ContactService;
import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;

@Controller
public class BillingController {

	@Autowired
	private BillingService billServ;
	
	
	@Autowired
	private ContactService contactServ;
	
	@RequestMapping("/ShowGenerateBill")
	public String showGenerateBillPage(@RequestParam("id") long id,ModelMap model) {
		
		Contact contact = contactServ.getOneConatctById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
		billServ.saveBill(bill);
		model.addAttribute("bill",bill);
		return "bill_info";
		
	}
	
	
	
}
