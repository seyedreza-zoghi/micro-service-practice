package org.msp.profileservice.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link org.msp.profileservice.model.User}
 */
@Data
public class UserDto implements Serializable {
    Long id;
    String username;
    String email;
    String password;
    Long profileId;
    Boolean isActive;
}