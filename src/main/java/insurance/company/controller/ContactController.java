package insurance.company.controller;

import insurance.company.model.Contact;
import insurance.company.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/getContactById/{ContactId}")
    public ResponseEntity<Optional<Contact>> getContactById(@PathVariable("ContactId") int ContactId) {
        return ResponseEntity.ok().body(contactService.getContactById(ContactId));
    }

    @GetMapping("/getContacts")
    public ResponseEntity<List<Contact>> getContacts() {
        List<Contact> contacts = contactService.getContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @PostMapping("/addContact")
    public ResponseEntity<Contact> addContact(@RequestBody Contact Contact) {
        Contact newContact = contactService.addContact(Contact);
        return new ResponseEntity<>(newContact, HttpStatus.CREATED);
    }

    @PutMapping("/updateContact")
    public ResponseEntity<Contact> updateContact(@RequestBody Contact Contact){
        Contact updatedContact = contactService.updateContact(Contact);
        return new ResponseEntity<>(updatedContact, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteContact/{ContactId}")
    public ResponseEntity<?> deleteContact(@PathVariable("ContactId") int ContactId){
        contactService.deleteContact(ContactId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
