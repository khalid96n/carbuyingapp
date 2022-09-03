package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOnLeadById(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listLeads();
}
