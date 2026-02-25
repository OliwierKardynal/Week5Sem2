package ie.atu.week5s2.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    @NotBlank(message = "Customer name is required")
    private String name;

    @Email(message = "Email must be valid")

    @NotBlank(message = "Email is required")
    private String email;

}