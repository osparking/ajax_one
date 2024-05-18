package space.bum.sboa2githb.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer {
  @Id
  private int seqno;
  private String customerID;
  private String companyname;
  private String contactname;
  private String address;
  private String city;
  private String postalcode;
  private String country;
}
