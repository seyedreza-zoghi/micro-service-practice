package org.msp.securityservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import msp.core.model.GenericBaseEntity;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permissions extends GenericBaseEntity<Long> {
    private String name;
    private boolean requiresVerification;
}
