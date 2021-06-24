package entities.dao;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId = null;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_email", unique = true)
    private String email;


    @Column(name = "user_phone", nullable = false)
    private String phone;

    @Column(name = "user_pass", nullable = false)
    private String password;

    @Column(name = "user_is_banned")
    private boolean isBanned;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserStatus status;


    @Column(name = "keycloak_id")
    private String keycloakId;

}
