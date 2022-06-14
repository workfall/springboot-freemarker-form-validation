package com.workfall.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Setter
@Getter
@ToString
public class User {

  @Size(min = 3, max = 50)
  String firstName;

  @Size(min = 1, max = 50)
  String lastName;

  @NotBlank(message = "Email address cannot be blank")
  @Email(message = "Please enter a valid email address")
  String email;

  @NotBlank(message = "Phone number cannot be blank")
  String phone;

  String gender;

  @NotBlank(message = "Birthday cannot be blank")
  @DateTimeFormat(pattern = "yyyy-mm-dd")
  String birthdate;
}
