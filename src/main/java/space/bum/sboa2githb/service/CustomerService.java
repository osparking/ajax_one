package space.bum.sboa2githb.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import space.bum.sboa2githb.domain.Customer;
import space.bum.sboa2githb.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService {
  private CustomerRepository customerRepository;

  public Customer getCustomerById(String customerId) {
    var customer = customerRepository.findByCustomerID(customerId);

    return customer.orElseThrow();
  }
}
