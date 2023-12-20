package ru.didcvee.photoappapiusers.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestModel
{
    private String userId;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2,message = "Firstname must not be less than two characters")
    private String firstName;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2,message = "Firstname must not be less than two characters")
    private String lastName;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2,message = "Firstname must not be less than two characters")
    private String password;
    @NotNull(message = "Name cannot be null")
    @Email
    private String email;
}
