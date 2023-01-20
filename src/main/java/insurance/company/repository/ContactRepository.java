package insurance.company.repository;

import insurance.company.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Optional<Contact> findContactByContactId(int contactId);

    void deleteContactByContactId(int contactId);
}
