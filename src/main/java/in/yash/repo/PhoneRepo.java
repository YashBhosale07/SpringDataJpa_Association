package in.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yash.model.PhoneNumber;

@Repository
public interface PhoneRepo extends JpaRepository<PhoneNumber, Integer> {

}
