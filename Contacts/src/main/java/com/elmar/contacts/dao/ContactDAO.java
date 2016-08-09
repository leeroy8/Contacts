package com.elmar.contacts.dao;

import java.util.List;

import com.elmar.contacts.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}