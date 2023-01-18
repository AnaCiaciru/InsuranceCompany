package insurance.company.repository;

import insurance.company.model.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Integer> {
}
