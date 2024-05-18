package space.bum.sboa2githb.controller;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import space.bum.sboa2githb.service.CustomerService;

@Controller
@AllArgsConstructor
public class CustomerController {

  private CustomerService customerService;

  @GetMapping("/getcustomer")
  @ResponseBody
  public String showCustomer(@RequestParam String customerID) {
    StringBuffer htmlTable = new StringBuffer("<table>");

    try {
      var customer = customerService.getCustomerById(customerID);

      htmlTable.append("<tr><th>CustomerID</th>");
      htmlTable.append("<td>");
      htmlTable.append(customer.getCustomerID());
      htmlTable.append("</td></tr>");

      htmlTable.append("<tr><th>CompanyName</th>");
      htmlTable.append("<td>");
      htmlTable.append(customer.getCompanyname());
      htmlTable.append("</td></tr>");

    } catch (NoSuchElementException e) {
    }
    htmlTable.append("</table>");
    return htmlTable.toString();
  }
}
