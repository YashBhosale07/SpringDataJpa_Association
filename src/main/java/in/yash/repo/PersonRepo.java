package in.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yash.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{ 

}
