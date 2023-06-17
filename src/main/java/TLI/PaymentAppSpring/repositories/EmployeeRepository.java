package TLI.PaymentAppSpring.repositories;

import TLI.PaymentAppSpring.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
