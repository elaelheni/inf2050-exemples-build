package ca.uqam.inf2050;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Contact {

  private Long id;
  private String name;
  private String email;
}
