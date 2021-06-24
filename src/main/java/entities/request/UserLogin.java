package entities.request;

import javax.validation.constraints.NotNull;

public class UserLogin {
    @NotNull
    private String email;
    @NotNull
    private String password;

}
