package com.zohocrm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
