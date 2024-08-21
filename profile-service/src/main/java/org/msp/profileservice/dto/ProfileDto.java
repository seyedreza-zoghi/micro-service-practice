package org.msp.profileservice.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.msp.profileservice.model.Profile}
 */
@Value
public class ProfileDto implements Serializable {
    Long id;
    Long userId;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    String city;
    String state;
    String postalCode;
    String country;
    String profilePictureUrl;
}