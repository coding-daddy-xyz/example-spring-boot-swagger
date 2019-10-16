package xyz.codingdaddy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * User domain object
 *
 * @author serhiy
 */

@ApiModel(description = "An entity used to identify the application clients")
@Entity(name="users")
public class User {
    @ApiModelProperty(notes = "Unique user identifier")
    @Id
    @GeneratedValue
    private Long id;

    @ApiModelProperty(notes = "Username used for authentication")
    private String username;

    @ApiModelProperty(notes = "Password used for authentication")
    private String password;

    @ApiModelProperty(notes = "E-mail used for contacting the user")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static User of(String username, String password, String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return user;
    }
}