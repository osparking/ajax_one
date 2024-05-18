package space.bum.sboa2githb.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import space.bum.sboa2githb.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
  Optional<Customer> findByCustomerID(String customerID);

}
