package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.LeadRepository;
import com.zohocrm.entities.Lead;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leaRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leaRepo.save(lead);
		
	}

	@Override
	public Lead getOnLeadById(long id) {
		Optional<Lead> findById = leaRepo.findById(id);
		Lead lead =  findById.get();
		return lead;
	}

	

	@Override
	public void deleteOneLeadById(long id) {
		leaRepo.deleteById(id);
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leaRepo.findAll();
		return leads;
	}

}
