package com.elmar.contacts.service;

import java.util.List;

import com.elmar.contacts.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
