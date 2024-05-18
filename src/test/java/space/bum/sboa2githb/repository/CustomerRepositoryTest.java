package space.bum.sboa2githb.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bum.sboa2githb.domain.Customer;

@SpringBootTest
class CustomerRepositoryTest {

  @Autowired
  private CustomerRepository customerRepository;

  @Test
  void test() {
    String soughtID = "ahnjb";
    Optional<Customer> ahnjbCustomer = customerRepository
        .findByCustomerID(soughtID);
    assertTrue(ahnjbCustomer.isPresent());
    assertNotNull(soughtID.equals(ahnjbCustomer.get().getCustomerID()));
  }
}
