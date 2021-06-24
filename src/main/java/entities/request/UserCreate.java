package entities.request;

import javax.validation.constraints.NotNull;



public class UserCreate {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String phone;

    @NotNull
    private String password;


}
