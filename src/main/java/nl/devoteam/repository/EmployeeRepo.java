package nl.devoteam.repository;

import nl.devoteam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findByFirstName(String firstName);
    Optional<Employee> findById(Long id);
}
