package insurance.company.service;

import insurance.company.model.Contact;
import insurance.company.repository.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact addContact(Contact contact){
        return contactRepository.save(contact);
    }

    public Contact updateContact(Contact contact){
        return contactRepository.save(contact);
    }

    /// because the delete method is
    @Transactional
    public void deleteContact(int ContactId){
        contactRepository.deleteContactByContactId(ContactId);
    }


    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(int ContactId){
        return contactRepository.findContactByContactId(ContactId);
    }
}
